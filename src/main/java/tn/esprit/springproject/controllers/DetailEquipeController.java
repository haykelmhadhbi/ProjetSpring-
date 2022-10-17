package tn.esprit.springproject.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.DetailEquipe;
import tn.esprit.springproject.services.IDepartmentService;
import tn.esprit.springproject.services.IDetailEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DetailEquipeController {
    IDetailEquipeService detailEquipeService ;


    @GetMapping
    List<DetailEquipe> retrieveAllDetailEquipe (){
        return  detailEquipeService.retrieveAllDetailEquipe();

    }
    @PostMapping("/ajouterequipe")
    DetailEquipe AjouterDetailEquipe (@RequestBody  DetailEquipe e){
        return detailEquipeService.addDetailEquipe(e);

    }
    @PutMapping("modifierequipe")
    DetailEquipe ModifierDetailEquipe (@RequestBody  DetailEquipe e){
        return  detailEquipeService.updateDetailEquipe(e);
    }

    @DeleteMapping("supprimeredetailequipe/{id}")
    void SupprimerDetailEquipe  (@PathVariable  Integer id){
        detailEquipeService.deleteDetailEquipe(id);

    }
    @GetMapping ("aficherdetailequipe/{id}")
    DetailEquipe retrieveDetailEquipe(@PathVariable Integer id){
        return  detailEquipeService.retrieveDetailEquipe(id);

    }


}
