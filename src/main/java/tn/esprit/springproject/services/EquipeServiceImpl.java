package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.repositories.EquipeRepository;

import java.util.List;

@Service
public class EquipeServiceImpl implements IEquipeService {

    EquipeRepository equipeRepository;

    public EquipeServiceImpl(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public void deleteEquipet(Integer id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public Equipe retrieveEquipe(Integer id) {
        return  equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void assignEquipeToEtudiant(Integer ideq) {

    }
}
