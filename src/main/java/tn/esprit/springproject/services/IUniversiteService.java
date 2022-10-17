package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversite ();

    Universite addUniversite (Universite e);

    Universite updateUniversite(Universite e);

    void deleteUniversite  (Integer id);

    Universite retrieveUniversite(Integer id);

    void assignUniversiteToDepartment (Integer idE);
}
