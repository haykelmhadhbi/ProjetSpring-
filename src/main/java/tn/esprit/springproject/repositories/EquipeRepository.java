package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.entites.Niveau;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository <Equipe ,Integer > {
  /*  List <Equipe> FindEquipeContainingAndNiveau (String nomEquipe, Niveau nv);//kyword
    @Query("select equipe from Equipe  equipe where equipe.nomEquipe=?1 and equipe.niveau=?2 ")//dans jpql suppossant que naticquary=false par defaut car on utilise ca dans sql
    List <Equipe> selectByNomeEtNiveayJPQL (String nomEquipe, Niveau nv);

    @Query("select e from Equipe  e where e.nomEquipe=:nom and e.niveau=:nv  ")
    List <Equipe> selectByNomeEtNiveayJPQL2 (@Param("nom") String nom,@Param("nv") Niveau nv);

    @Query(value = "select * from T_Equipe where nom=?1 and nv=?2  " , nativeQuery = true)//pour t_quipe meme majuscule toujours prendre min car il na pas en contacte avec le entity just conx direct avec base de donner
    List <Equipe> selectByNomeEtNiveaySQL (String nom, Niveau nv);
    @Query (value = "select * from t_equipe where nom=: nom and n=:n", nativeQuery = true)
    List <Equipe> selectByNomeEtNiveaySQL2 (@Param("nom") String nom, @Param("n") Niveau nv);

    List <Equipe> FindDetailEquipeById (String thematique);
    @Query("select e from Equipe e , DetailEquipe d where e.Detail_equipe.idDetailEquipe = d.idDetailEquipe and d.thematique=? 1")
    List <Equipe> SelectDetailEquipeByIdJPQL (String thematique);
    @Query(value = "select e from  T_Equipe as e  join  DetailEquipe d on e.detail_equipe.id_detail_equipe= d.id_detail_equipe and d.thematique=?1" , nativeQuery = true)
    List <Equipe> SelectDetailEquipeByIdJSQL (String thematique);*/


}
