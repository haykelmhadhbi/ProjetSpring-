package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.entites.Etudiant;

import java.util.List;

public interface IEtudiantService {


    List<Etudiant> retrieveAllEtudiant ();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    void deleteEtudiant(Integer id);

    Etudiant retrieveEtudiant(Integer id);

    void assignEtudiantToEQuipe (Integer ideq);
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

}
