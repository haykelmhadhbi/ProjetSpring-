package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.IUniversiteService;

import java.util.List;

@RestController

@RequestMapping("Univeristee")
public class UniversiteController {
    IUniversiteService universiteService;
    public  UniversiteController (IUniversiteService universiteService){
        this.universiteService=universiteService;
    }

    @GetMapping
    List<Universite> retrieveAllUniversite (){
        return  universiteService.retrieveAllUniversite();
    }
    @PostMapping
    Universite addUniversite (@RequestBody  Universite e){
        return  universiteService.addUniversite(e);
    }
    @PutMapping("/modifieruniversite")
    Universite updateUniversite(@RequestBody  Universite e){
        return  universiteService.updateUniversite(e);
    }

    @DeleteMapping("supprimeruniv/{id}")
    void deleteUniversite  (@PathVariable  Integer id){
        universiteService.deleteUniversite(id);
    }
@GetMapping("afficheruniv/{id}")
    Universite retrieveUniversite(Integer id){
        return universiteService.retrieveUniversite(id);
}

    @PutMapping ("/affectUnivToDep/{idUniversite}/{idDepartement}")
    void AffectUniversiteToDepartement (@PathVariable Integer idUniversite, @PathVariable Integer idDepartement){
        universiteService.assignUniversiteToDepartement(idUniversite, idDepartement);
    }

}
