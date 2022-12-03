package tn.esprit.springproject.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Specialite;
import tn.esprit.springproject.services.IContratService;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
    @PutMapping("affectContratToEtudiant/{nom}/{prenom}")
    Contrat affectContratToEtudiant (@RequestBody Contrat c ,@PathVariable  String nom ,@PathVariable String prenom){

        return  contratService.affectContratToEtudiant(c,nom , prenom  );
    }

    @GetMapping ("/nbContratsValides/{startDate}/{endDate}")
    Integer nbContratsValides(@PathVariable  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate, @PathVariable  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate){
        return contratService.nbContratsValides(startDate,endDate);
    }

    @GetMapping("/allContratBySpecialite/{specialite}")
    Set <Contrat> allContratBySpecialite (@PathVariable Specialite specialite){
        return contratService.allContratBySpecialite(specialite);
    }





}
