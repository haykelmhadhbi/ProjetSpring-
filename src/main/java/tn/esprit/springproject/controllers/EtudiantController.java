package tn.esprit.springproject.controllers;


import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.services.IDepartmentService;
import tn.esprit.springproject.services.IDetailEquipeService;
import tn.esprit.springproject.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {
    IEtudiantService etudiantService ;
    public EtudiantController (IEtudiantService etudiantService ){
        this.etudiantService=etudiantService;
    }

    @GetMapping
    List<Etudiant> retrieveAllEtudiant (){
        return etudiantService.retrieveAllEtudiant();
    }

    @PostMapping("/ajouteretudiant")
    Etudiant  AjourterEtudiant (@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("modifieretudiant")
    Etudiant ModifierEtudiant (@RequestBody  Etudiant e){
        return etudiantService.updateEtudiant(e);
    }
    @DeleteMapping("supprimeretudiant /{id}")
    void SupprimerEtudiant(@PathVariable  Integer id){
        etudiantService.deleteEtudiant(id);
    }
    @GetMapping("afficheralletduiant/{id}")
    Etudiant retrieveEtudiant(@PathVariable  Integer id){

        return etudiantService.retrieveEtudiant(id);
    }

    @PostMapping("ajouteretdudiantpourdepartment/{idet} {iddep}")
    void ajouterEtudiantToDepartement (@PathVariable Integer idet ,@PathVariable Integer iddep  ){
        etudiantService.assignEtudiantToDepartement(idet , iddep);
    }
    @PutMapping ("/affecterE/{etudiantId}/{departementId}")
    void assignEtudiantToDepartement (@PathVariable Integer etudiantId ,@PathVariable Integer departementId){
        etudiantService.assignEtudiantToDepartement(etudiantId ,departementId );
    }
    @PutMapping ("/ajouterAndAffecterEtuToContandEquip/{idContrat}/{idEquipe}")
     Etudiant ajouterAndAffecterEtudiantToEquipeAndContract(@RequestBody  Etudiant e,@PathVariable Integer idContrat,@PathVariable Integer idEquipe) {
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat, idEquipe );
     }


}
