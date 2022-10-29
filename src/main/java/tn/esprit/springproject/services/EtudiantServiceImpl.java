package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.List;
import java.util.Set;

@Service
public class EtudiantServiceImpl implements  IEtudiantService{
    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository , DepartementRepository departementRepository) {
        this.etudiantRepository = etudiantRepository;
        this.departementRepository=departementRepository;
    }

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
        return  etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void assignEtudiantToEQuipe(Integer ideq) {

    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant Etu=etudiantRepository.findById(etudiantId).get();
        Departement Dep=departementRepository.findById(departementId).get();

        Etu.setDepart(Dep);
        etudiantRepository.save(Etu);
        }






}

