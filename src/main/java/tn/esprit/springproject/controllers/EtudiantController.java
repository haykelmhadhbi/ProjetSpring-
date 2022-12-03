package tn.esprit.springproject.controllers;


import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Matiere;
import tn.esprit.springproject.entites.Niveau;
import tn.esprit.springproject.entites.Option;
import tn.esprit.springproject.services.IDepartmentService;
import tn.esprit.springproject.services.IDetailEquipeService;
import tn.esprit.springproject.services.IEtudiantService;

import java.util.List;
import java.util.Set;

@RestController
//@RequestMapping("etudiant")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class EtudiantController {
    IEtudiantService etudiantService;

    public EtudiantController(IEtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("/getEtudiant")
    List<Etudiant> retrieveAllEtudiant() {
        return etudiantService.retrieveAllEtudiant();
    }

    @PostMapping("/ajouterEtudiant")
    Etudiant AjourterEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("/modifieretudiant")
    Etudiant ModifierEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/supprimeretudiant")
    void SupprimerEtudiant(@RequestParam Integer id) {
        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("afficherAllEtduiant/{id}")
    Etudiant retrieveEtudiant(@PathVariable Integer id) {

        return etudiantService.retrieveEtudiant(id);
    }


    @PutMapping("/affecterE/{etudiantId}/{departementId}")
    void assignEtudiantToDepartement(@PathVariable Integer etudiantId, @PathVariable Integer departementId) {
        etudiantService.assignEtudiantToDepartement(etudiantId, departementId);
    }

    @PutMapping("/ajouterAndAffecterEtuToContandEquip/{idContrat}/{idEquipe}")
    Etudiant ajouterAndAffecterEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e, idContrat, idEquipe);
    }

    @GetMapping("/getEtudiantsByDepartementt/{idDep}")
    Set<Etudiant> displayEtudiantsByDepartement(@PathVariable Integer idDep) {
        return etudiantService.getEtudiantsByDepartement(idDep);
    }

    @GetMapping("/getEtudiantByProfesseurwithNomAndPrenom/{prenomP}/{nomP}")
    Set<Etudiant>getEtudiantByProfesseur (@PathVariable String prenomP , @PathVariable String nomP){
        return etudiantService.getEtudiantsByProfesseur(prenomP , nomP);
    }

    @PostMapping("/addEtudiantandAffectToEquipe/{N}")
        Etudiant addAndAssignEtudiantToEquipeByNiveau (@RequestBody Etudiant e , @PathVariable Niveau N){
        return  etudiantService.addAndAssignEtudiantToEquipeByNiveau(e,N);

    }
    @GetMapping("/getEtudiantByOption/{Op}")
    public List<Etudiant> getEtudiantByOption(@PathVariable Option Op){
        return  etudiantService.getEtudiantByOption(Op);
    }

    @GetMapping("/getEtudiantBySexe/{sexe}")

    public List<Etudiant> getEtudiantBySexe (@PathVariable String sexe){
        return etudiantService.getEtudiantBySexe(sexe);
    }

    @PostMapping("/addEtuToProfbyOptionandMatier/{o}/{m}/{nbr}")

    public Set<Etudiant> addEtByOptAndMatierProf (@PathVariable  Option o , @PathVariable  Matiere m , @PathVariable Integer nbr ){
        return  etudiantService.addEtudbyOptToProfDepartmentAdispo(o, m, nbr);
    }

    @GetMapping("/getAllEtudiantBySalleDetailequipe/{numSalle}")

    Set <Etudiant> getEtudiantsBySalleDetailequipe (@PathVariable Integer numSalle){
        return  etudiantService.getAllEtudiantByNumerodeSal(numSalle);
    }








}




