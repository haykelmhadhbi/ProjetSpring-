package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Contrat;

import java.util.Date;
import java.util.List;


@Repository // comme si devloppeur donner un signe a l application qui le compsoant contartrepostry 7achti bih ykoun mawjoud fi ioc. , je declarer un composant eli 7atito fi ioc il houwa mawjopud fi couche acces au bas de donner
public interface ContratRepository extends JpaRepository<Contrat ,Integer > {//kol entiter andha repartoir mtaha ahna ki amalna repostry mtaa contrat lena donc crudreporstry mtaa3 contrat
    //no le type premitive dima typoe wrraper mem type id ama mech primitive dima wrapper nhotou(long hiya primitivi w Longe hiya wraaper)
//crudrepostry basci qui peut fournir de crud basic

    @Query("select  c from  Contrat  c  where c.dateDebutContrat=?1 and c.dateDebutContrat=?2 and c.archive=false ")
    List<Contrat> getContratByDate (Date starDate, Date EndDATE );

    List<Contrat>findContratByDateFinContratBetween (Date date1,Date date2);

}

