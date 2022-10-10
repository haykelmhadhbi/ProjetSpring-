package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Contrat;

import java.util.List;

public interface IContratService {
    List <Contrat> retrieveAllContrat ();

    Contrat addContrat (Contrat c);

    Contrat updateContrat (Contrat c);

    void deleteContrat (Integer id);

    Contrat retrieveContrat (Integer id);

    void assignContratToEtudiant (Integer idC);


}
