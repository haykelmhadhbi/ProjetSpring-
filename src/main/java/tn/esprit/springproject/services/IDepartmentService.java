package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Departement;

import java.util.List;

public interface IDepartmentService {

    List <Departement> retrieveAllContrat ();

    Departement addDepartment (Departement d);

    Departement updateDepartment (Departement d);

    void deleteDepartment (Integer id);

    Departement retrieveDepartment (Integer id);

    void assignDepartmentToEtudiant (Integer idC);










}
