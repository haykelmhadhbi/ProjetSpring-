package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Departement;

import java.util.List;
import java.util.Set;

public interface IDepartmentService {

    List <Departement> retrieveAllDepartment ();

    Departement addDepartment (Departement d);

    Departement updateDepartment (Departement d);

    void deleteDepartment (Integer id);

    Departement retrieveDepartment (Integer id);

     Set <Departement> retrieveDepartementsByUniversite(Integer idUniversite);













}
