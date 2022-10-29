package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.services.IDepartmentService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("departmentt")
public class DepartementController {

    IDepartmentService departmentService ;


    @GetMapping
    List<Departement> AfficherAllDeprtrment  (){
        return departmentService.retrieveAllDepartment();
    }


    @PostMapping("/ajouterDepartment")
    Departement addDepartment (@RequestBody Departement d){
        return  departmentService.addDepartment(d);
    }
        @PutMapping("/modifierDepartment")
    Departement updateDepartment ( @RequestBody  Departement d){
        return  departmentService.updateDepartment(d);

    }
    @DeleteMapping("supprimerDepartment/{id}")
    void deleteDepartment (@PathVariable  Integer id){
        departmentService.deleteDepartment(id);
    }
    @GetMapping ("aficherDepartment/{id}")
    Departement retrieveDepartment (@PathVariable  Integer id){
        return  departmentService.retrieveDepartment(id);

    }

}
