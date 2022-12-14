package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Departement;

import java.util.Set;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer > /*PagingAndSortingRepository //fiha tri w paginatioon */ {

    Set <Departement> findDepartementsByNomDepart (String nomDepar);

    @Query ("select  dep from Departement  dep where  dep.nomDepart=:nameDep ")
    Set <Departement> getDepawithnamedep (@Param("nameDep") String nameDep);
}
