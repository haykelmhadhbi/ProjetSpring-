package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Option;
import tn.esprit.springproject.entites.Professeur;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    //Cette méthode permet d’afficher les etudiants que l’étudiant n’a pas dépassé la limite autorisée de 5 contrats actifs..
    @Query("select e from Etudiant  e , Contrat  c where  e.idEtudiant=c.etudian.idEtudiant and e.idEtudiant=:et   and c.archive =:true and e.contrats.size<5")
    Etudiant retriecEtudiantOuContratInf5 (@Param("et") Integer et);

    Etudiant findEtudiantByNomEAndPrenomE(String nomE , String PrenomE);


    @Query ("select  e from  Etudiant  e where e.nomE=:nomE and  e.prenomE=:prenomE ")
    Etudiant retriecEtudiantByNomEtPrenom (@Param("prenomE") String nomE , @Param( "nomE") String prenomE ) ;

    @Query ("select  e from Etudiant  e where e.depart.idDepart =?1")
    Set <Etudiant> getEtudiantsByDepartement (Integer idDep );

    List<Etudiant> findEtudiantsByOpt(Option o);

    List<Etudiant> findEtudiantsBySexe(String sexe);

    @Query ("select  e from Etudiant  e  where  e.opt=:opt and e.depart.nomDepart='A'")
    Set <Etudiant> getEtudiantsByOpt (@Param("opt") Option opt );

    @Query("select  Et from Etudiant  Et   , Departement  dep  where Et.depart.idDepart = dep.idDepart and dep.nomDepart=: nomdep ")
    Set <Etudiant> getEtudwithNamdepa (@Param("nomdep") String nomdep);
  //Set <Etudiant> findEtudiantsByDepartNomDepart(String nom);
    //Set<Etudiant> findEtudiantsByNomE(String Nom);


    @Query ("select  E from  Etudiant  E where E.nomE=:nomEt")
    Etudiant findEtudiantByNomE (@Param("nomEt") String nomEt);

    @Query ("select E from Etudiant  E INNER JOIN E.equipes equipe INNER join DetailEquipe  detailequipe ON equipe.Detail_equipe.idDetailEquipe=detailequipe.idDetailEquipe where detailequipe.salle=:numero ")
    Set<Etudiant> getAllEtudiantBynumerosalledetaequipe (@Param("numero") Integer numero);






}
