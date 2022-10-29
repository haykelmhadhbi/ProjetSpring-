package tn.esprit.springproject.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("equipe")
public class EquipeController {
    IEquipeService equipeService ;

    @GetMapping
    List<Equipe> retrieveAllEquipe (){
        return  equipeService.retrieveAllEquipe();
    }

    @PostMapping("/ajouterequipe")
    Equipe addEquipe ( @RequestBody  Equipe e){
        return  equipeService.addEquipe(e);

    }

    @PutMapping("/modifierequipe")
    Equipe updateEquipe (@RequestBody  Equipe e){
        return  equipeService.updateEquipe(e);
    }
    @DeleteMapping ("supprimerequipe/{id}")
    void deleteEquipet (@PathVariable  Integer id){
        equipeService.deleteEquipet(id);
    }
    @GetMapping("afficherlesequipe {id}")
    Equipe retrieveEquipe(Integer id){
        return  equipeService.retrieveEquipe(id);
    }

}
