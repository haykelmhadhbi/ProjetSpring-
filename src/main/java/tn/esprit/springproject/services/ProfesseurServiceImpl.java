package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Professeur;
import tn.esprit.springproject.repositories.ProfesseurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesseurServiceImpl implements IProfesseurService {

    ProfesseurRepository professeurRepository ;
    @Override
    public List<Professeur> retrieveAllProfesseur() {
        return professeurRepository.findAll();
    }

    @Override
    public Professeur addProfesseur(Professeur e) {
            return  professeurRepository.save(e);
    }

    @Override
    public Professeur updateProfesseur(Professeur e) {
        return professeurRepository.save(e);
    }

    @Override
    public void deleteProfesseur(Integer id) {
        professeurRepository.deleteById(id);

    }

    @Override
    public Professeur retrieveProfesseur(Integer id) {
        return professeurRepository.findById(id).orElse(null);
    }
}
