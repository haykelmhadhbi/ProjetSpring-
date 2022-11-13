package tn.esprit.springproject.services;


import tn.esprit.springproject.entites.Professeur;

import java.util.List;

public interface IProfesseurService {

    List<Professeur> retrieveAllProfesseur ();

    Professeur addProfesseur(Professeur e);

    Professeur updateProfesseur(Professeur e);

    void deleteProfesseur(Integer id);

    Professeur retrieveProfesseur(Integer id);

}
