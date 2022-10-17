package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.repositories.ContratRepository;

import java.util.List;

//@Component

@Service //takrah beann w tamala instance fi ioc eli houwa service don nimplementa contartservicimpl comme instance fi ioc
//bech najmou netsamlo methode mawjouda fi repostery nijcethouh lena fi serviice par @authoward
//@AllArgsConstructor  si malmlnach injection constructer heki tkoum b wajeb
public class ContratServiceImpl implements IContratService {

    //@Autowired
    ContratRepository contratRepository ;
    //les methode fi jparepostry mta contratrepostry rahoo fi service len tu es  autoriser d'utiliser les methode hekom


    public ContratServiceImpl(ContratRepository contratRepository ) {
        this.contratRepository = contratRepository;
    }


    @Override
    public List<Contrat> retrieveAllContrat() {
        return contratRepository.findAll() ;
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save((c));
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void deleteContrat(Integer id) {
            contratRepository.deleteById(id);
    }

    @Override
    public Contrat retrieveContrat(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void assignContratToEtudiant(Integer idC) {

    }
}
