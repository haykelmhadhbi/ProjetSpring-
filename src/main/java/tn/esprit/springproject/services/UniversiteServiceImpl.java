package tn.esprit.springproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.UniversiteRespository;

import java.util.List;
import java.util.Set;
@Service
@Slf4j

public class UniversiteServiceImpl implements IUniversiteService {


    UniversiteRespository universiteRespository;
    DepartementRepository departementRepository;
    public UniversiteServiceImpl (UniversiteRespository universiteRespository , DepartementRepository departementRepository){
        this.universiteRespository=universiteRespository;
        this.departementRepository=departementRepository;
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
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite Uni = universiteRespository.findById(idUniversite).orElse(null);
        Departement Dep = departementRepository.findById(idDepartement).orElse(null);
         Uni.getDepartment().add(Dep);

        universiteRespository.save(Uni);


    }


}
