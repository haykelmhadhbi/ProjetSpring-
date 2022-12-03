package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Specialite;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IContratService {
    List <Contrat> retrieveAllContrat ();

    Contrat addContrat (Contrat c);

    Contrat updateContrat (Contrat c);

    void deleteContrat (Integer id);

    Contrat retrieveContrat (Integer id);

    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);

  Integer nbContratsValides(Date startDate, Date endDate);

  Set<Contrat> allContratBySpecialite (Specialite sp);



}
