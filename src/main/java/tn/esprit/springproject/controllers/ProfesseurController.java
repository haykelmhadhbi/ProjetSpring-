package tn.esprit.springproject.controllers;


import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Professeur;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.IProfesseurService;
import tn.esprit.springproject.services.ProfesseurServiceImpl;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("professeur")
public class ProfesseurController {
    IProfesseurService professeurService ;
    public ProfesseurController ( IProfesseurService professeurService){
        this.professeurService=professeurService;
    }

    @GetMapping("/getAllProfesseur")
    List<Professeur> retrieveAllProfesseur (){
        return  professeurService.retrieveAllProfesseur();
    }
    @PostMapping("/ajouterProfesseur")
    Professeur addProfesseur (@RequestBody Professeur p){
        return  professeurService.addProfesseur(p);
    }
    @PutMapping("/modifierProfesseur")
    Professeur updateProfesseur(@RequestBody  Professeur p){
        return  professeurService.updateProfesseur(p);
    }
    @DeleteMapping("/supprimerProf/{id}")
    void deleteProfesseur  (@PathVariable  Integer id){
        professeurService.deleteProfesseur(id);
    }
    @GetMapping("/afficherProfesseur/{id}")
    Professeur retrieveProfesseur(Integer id){
        return professeurService.retrieveProfesseur(id);
    }

    @GetMapping ("/getAllProfByDepartment/{nomedepa}")
    Set <Professeur> getAllProfByDepartment (@PathVariable String nomedepa){
        return  professeurService.getAllProfByDepartment(nomedepa);
    }
    @GetMapping ("/getProfByNamEtud/{nomEtud}")
        Set <Professeur> getProfByNamEtud (@PathVariable String nomEtud){
                return  professeurService.getProfByNamEtud(nomEtud);
        }


}
