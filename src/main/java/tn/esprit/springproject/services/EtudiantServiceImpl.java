package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.repositories.ContratRepository;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.EquipeRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.List;
import java.util.Set;

@Service
public class EtudiantServiceImpl implements  IEtudiantService {
    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository, DepartementRepository departementRepository
            , ContratRepository contraRepository, EquipeRepository equipeRepository) {
        this.etudiantRepository = etudiantRepository;
        this.departementRepository = departementRepository;
        this.contratRepository = contraRepository;
        this.equipeRepository = equipeRepository;
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
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        Departement D = departementRepository.findById(idDepartement).orElse(null);
        Set <Etudiant> E = D.getEtdiant();
         return (List<Etudiant>) E;
    }


}

