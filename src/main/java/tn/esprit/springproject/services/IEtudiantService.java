package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.entites.Etudiant;

import java.util.List;
import java.util.Set;

public interface IEtudiantService {


    List<Etudiant> retrieveAllEtudiant ();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    void deleteEtudiant(Integer id);

    Etudiant retrieveEtudiant(Integer id);

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    Set<Etudiant> getEtudiantsByDepartement (Integer idDepartement);



}
