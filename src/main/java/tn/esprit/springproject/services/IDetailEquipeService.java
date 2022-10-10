package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {


    List<DetailEquipe> retrieveAllDetailEquipe ();

    DetailEquipe addDetailEquipe (DetailEquipe e);

    DetailEquipe updateDetailEquipe (DetailEquipe e);

    void deleteDetailEquipe  (Integer id);

    DetailEquipe retrieveDetailEquipe(Integer id);

    void assigndetailequipetoequipe (Integer idE);
}
