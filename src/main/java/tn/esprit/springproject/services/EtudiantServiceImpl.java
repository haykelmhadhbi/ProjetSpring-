package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.*;
import tn.esprit.springproject.repositories.*;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class EtudiantServiceImpl implements  IEtudiantService {
    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;
    ProfesseurRepository professeurRepository ;



    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public Etudiant retrieveEtudiant(Integer id) {

        return etudiantRepository.findById(id).orElse(null);
    }


    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant Etu = etudiantRepository.findById(etudiantId).orElse(null);
        Departement Dep = departementRepository.findById(departementId).orElse(null);

        Etu.setDepart(Dep);
        etudiantRepository.save(Etu);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat cont = contratRepository.findById(idContrat).orElse(null);
        Equipe equip = equipeRepository.findById(idEquipe).orElse(null);
            Etudiant Et;
            Et = this.addEtudiant(e);
            Et.getContrats().add(cont);
            Et.getEquipes().add(equip);
            etudiantRepository.save(Et);
            return  Et;


       // }


    }

    @Override
    public Set <Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        return  etudiantRepository.getEtudiantsByDepartement(idDepartement);

        /*Departement D = departementRepository.findById(idDepartement).orElse(null);
        return  D.getEtdiant();*/

    }

    @Override
    public Set<Etudiant> getEtudiantsByProfesseur(String prenomP, String nomP) {
        Professeur P = professeurRepository.getProfesseurByPrenomPAndNomP(prenomP, nomP);
        return  P.getEtudiants();
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeByNiveau(Etudiant e, Niveau n) {
            List<Equipe> Lequipe = equipeRepository.findEquipesByNiveau(n);
            Etudiant E =etudiantRepository.save(e);

        for(Equipe Et : Lequipe){
                Et.getEtudiants().add(E);
                equipeRepository.save(Et);
        }

            return  E;
        }

    @Override
    public List<Etudiant> getEtudiantByOption(Option op) {
        List<Etudiant> E =etudiantRepository.findEtudiantsByOpt(op);
        return  E ;
    }

    @Override
    public List<Etudiant> getEtudiantBySexe(String sexe) {

            List <Etudiant> LEtudBySexe = etudiantRepository.findEtudiantsBySexe(sexe);
            return  LEtudBySexe;
    }

    @Override
    public Set<Etudiant> addEtudbyOptToProfDepartmentAdispo(Option op , Matiere m , Integer nbr) {
        Set<Etudiant> EList = etudiantRepository.getEtudiantsByOpt(op);
        Set<Professeur>pListe = professeurRepository.getProfDispoAndHeurMinThen5(m,nbr);
        for (Professeur P : pListe){
            P.setEtudiants(EList);
            professeurRepository.save(P);
        }
        return  EList;
    }

    @Override
    public Set<Etudiant> getAllEtudiantByNumerodeSal(Integer numSalle) {
          return  etudiantRepository.getAllEtudiantBynumerosalledetaequipe(numSalle);
    }


}







