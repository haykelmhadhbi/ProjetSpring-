package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("Univeriste")
public class UniversiteController {
    IUniversiteService universiteService;

    @GetMapping
    List<Universite> retrieveAllUniversite (){
        return  universiteService.retrieveAllUniversite();
    }
    @PutMapping
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

}
