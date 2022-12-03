package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Matiere;
import tn.esprit.springproject.entites.Professeur;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {

    Professeur getProfesseurByPrenomPAndNomP(String prenomP , String nomP);



    @Query("select  p from  Professeur  p where p.nbrHeursEtud<:nbr and p.conge=true and p.matiere=:m ")
    Set<Professeur> getProfDispoAndHeurMinThen5 (@Param("m") Matiere m ,@Param("nbr") Integer nbr);

    @Query("select  P from Professeur  P  join P.etudiants etud join Departement  dep ON etud.depart.idDepart = dep.idDepart  and dep.nomDepart=:nomdep ")
    Set <Professeur> getEtudwithNamdepa (@Param("nomdep") String nomdep);







}
