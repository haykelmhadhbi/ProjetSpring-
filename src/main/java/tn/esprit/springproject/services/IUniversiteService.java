package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Universite;

import java.util.Date;
import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite e);

    Universite updateUniversite(Universite e);

    void deleteUniversite(Integer id);

    Universite retrieveUniversite(Integer id);

    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);

    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);




}
