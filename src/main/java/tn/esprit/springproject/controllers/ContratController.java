package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.services.IContratService;

import java.util.List;

//@Controller //ma sprinb mvc tekdhem abec de vew wost app matatikch ddonner format json
@RestController//ll requet web http kahaw yansalk requet http = @controller +@Responsebody directment exposer de rest api donc restcontrroller
@RequestMapping("contratt")
@AllArgsConstructor

public class ContratController {

    IContratService contratService;

    @GetMapping
    List<Contrat> retrieveAllContrat (){
        return  contratService.retrieveAllContrat();

    }

    @PostMapping("/ajouterContrat")
    Contrat addContrat (@RequestBody Contrat c){//eli chnhotoulk fi body fi postman haka 7othouli kan nul yani fama requesbody wla famach getter w setter

        return contratService.addContrat(c);
    }

    @PutMapping ("/modifierContrat")
    Contrat updateContrat(@RequestBody Contrat c){//5ater mech chtabth varaiable chtabath objet donc kolhom chyt7atou fi request wahed
        return contratService.updateContrat(c);

    }
    @DeleteMapping ("supprimerContrat/{id}")
    void deleteContrat (@PathVariable Integer id){
        contratService.deleteContrat(id);

    }
    @GetMapping("afficherContrat/{id}")
    Contrat retrieveContrat ( @PathVariable  Integer id){
        return  contratService.retrieveContrat(id);

    }





}
