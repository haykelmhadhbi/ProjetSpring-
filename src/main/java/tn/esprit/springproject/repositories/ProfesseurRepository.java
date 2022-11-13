package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {

    Professeur getProfesseurByPrenomPAndNomP(String prenomP , String nomP);
}
