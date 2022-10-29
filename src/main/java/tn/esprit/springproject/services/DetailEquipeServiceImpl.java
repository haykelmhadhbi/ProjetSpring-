package tn.esprit.springproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.DetailEquipe;
import tn.esprit.springproject.entites.Equipe;
import tn.esprit.springproject.repositories.DetailEquipeRepository;

import java.util.List;

@Service//declarer un composant app ala couche service
@Slf4j

public class DetailEquipeServiceImpl implements  IDetailEquipeService {
      DetailEquipeRepository detailEquipeRepository ;

    public DetailEquipeServiceImpl(DetailEquipeRepository detailEquipeRepository) {
        this.detailEquipeRepository= detailEquipeRepository;
    }

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipe() {
        return detailEquipeRepository.findAll() ;
    }

    @Override
    public DetailEquipe addDetailEquipe (DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }

    @Override
    public DetailEquipe updateDetailEquipe (DetailEquipe de) {
        return detailEquipeRepository.save(de);
    }




    @Override
    public void deleteDetailEquipe (Integer id) {
        detailEquipeRepository.deleteById(id);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe (Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void assigndetailequipetoequipe (Integer idE) {

    }
}
