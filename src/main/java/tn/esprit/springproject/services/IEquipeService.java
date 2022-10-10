package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.DetailEquipe;
import tn.esprit.springproject.entites.Equipe;

import java.util.List;

public interface IEquipeService {


    List<Equipe> retrieveAllEquipe ();

    Equipe addEquipe (Equipe e);

    Equipe updateEquipe (Equipe e);

    void deleteEquipet (Integer id);

    Equipe retrieveEquipe(Integer id);

    void assignEquipeToEtudiant (Integer ideq);
}
