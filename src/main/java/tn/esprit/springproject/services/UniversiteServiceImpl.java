package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.UniversiteRespository;

import java.util.List;

public class UniversiteServiceImpl implements IUniversiteService {


    UniversiteRespository universiteRespository;
    public UniversiteServiceImpl (UniversiteRespository universiteRespository){
        this.universiteRespository=universiteRespository;
    }


    @Override

    public List<Universite> retrieveAllUniversite() {
        return  universiteRespository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRespository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return  universiteRespository.save(e) ;
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRespository.deleteById(id);

    }

    @Override
    public Universite retrieveUniversite(Integer id) {
        return universiteRespository.findById(id).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartment(Integer idE) {

    }
}
