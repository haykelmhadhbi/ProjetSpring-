package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.UniversiteRespository;

import java.util.List;
import java.util.Set;

@Service

@AllArgsConstructor

public class DepartementServiceImpl implements  IDepartmentService {

    DepartementRepository departementRepository ;
    UniversiteRespository universiteRespository;


    @Override
    public List<Departement> retrieveAllDepartment() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartment(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartment(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public void deleteDepartment(Integer id) {

        departementRepository.deleteById(id);
    }

    @Override
    public Departement retrieveDepartment(Integer id) {
         return departementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite Un = universiteRespository.findById(idUniversite).orElse(null);
            return Un.getDepartment();
    }



    /*public DepartementServiceImpl(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }*/
}
