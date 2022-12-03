package tn.esprit.springproject.services;


import tn.esprit.springproject.entites.Professeur;

import java.util.List;
import java.util.Set;

public interface IProfesseurService {

    List<Professeur> retrieveAllProfesseur ();

    Professeur addProfesseur(Professeur e);

    Professeur updateProfesseur(Professeur e);

    void deleteProfesseur(Integer id);

    Professeur retrieveProfesseur(Integer id);

    Set<Professeur> getAllProfByDepartment (String nomDepa);

    Set  <Professeur> getProfByNamEtud (String NamEt);

}
