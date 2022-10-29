package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.repositories.DepartementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartementServiceImpl implements  IDepartmentService {

    DepartementRepository departementRepository ;

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
    public void assignDepartmentToEtudiant (Integer idC) {
        return ;

    }

    /*public DepartementServiceImpl(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }*/
}
