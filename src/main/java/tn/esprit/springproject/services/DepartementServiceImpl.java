package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.repositories.DepartementRepository;

import java.util.List;

@Service

@Slf4j

public class DepartementServiceImpl implements  IDepartmentService {

    DepartementRepository departementRepository ;
    public DepartementServiceImpl (DepartementRepository departementRepository){
        this.departementRepository=departementRepository;
    }

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



    /*public DepartementServiceImpl(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }*/
}
