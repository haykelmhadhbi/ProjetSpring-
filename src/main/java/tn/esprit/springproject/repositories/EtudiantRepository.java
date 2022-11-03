package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    //Cette méthode permet d’afficher les etudiants que l’étudiant n’a pas dépassé la limite autorisée de 5 contrats actifs..
    @Query("select e from Etudiant  e  where    e.contrats.size <5 and e.idEtudiant=:idEtudiant ")
    Etudiant  retriecEtudiantOuContratInf5 (@Param("idEtudiant") Integer idET);



   @Query ("select  e from  Etudiant  e where  e.prenomE=:prenomE and e.nomE=:nomE")
    Etudiant retriecEtudiantByNomEtPrenom (@Param("prenomE") String prenomE , @Param( "nomE") String nomE ) ;

}
