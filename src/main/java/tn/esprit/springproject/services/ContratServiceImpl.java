package tn.esprit.springproject.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Specialite;
import tn.esprit.springproject.repositories.ContratRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.Date;
import java.util.List;
import java.util.Set;

//@Component

@Service //takrah beann w tamala instance fi ioc eli houwa service don nimplementa contartservicimpl comme instance fi ioc
//bech najmou netsamlo methode mawjouda fi repostery nijcethouh lena fi serviice par @authoward
//@AllArgsConstructor  si malmlnach injection constructer heki tkoum b wajeb
@Slf4j
public class ContratServiceImpl implements IContratService {

    //@Autowired
    ContratRepository contratRepository ;
    EtudiantRepository etudiantRepository;
    //les methode fi jparepostry mta contratrepostry rahoo fi service len tu es  autoriser d'utiliser les methode hekom


    public ContratServiceImpl(ContratRepository contratRepository ,  EtudiantRepository etudiantRepository) {

        this.contratRepository = contratRepository;
        this.etudiantRepository=etudiantRepository;
    }


    @Override
    public List<Contrat> retrieveAllContrat() {
        log.info("recuperation ToTale");

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
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {

      Etudiant Et1 = etudiantRepository.retriecEtudiantByNomEtPrenom(prenomE , nomE);

       Etudiant Et2 = etudiantRepository.retriecEtudiantOuContratInf5(Et1.getIdEtudiant());

        if (Et2.equals(Et1)){
            ce.setEtudian(Et2);


        }
        else {
            return  null;
        }
        contratRepository.save(ce);
        return  contratRepository.save(ce);


        /*Etudiant Et1 = etudiantRepository.retriecEtudiantByNomEtPrenom(prenomE , nomE);;
        ce.setEtudian(Et1);
        contratRepository.save(ce);

        return contratRepository.save(ce);*/







    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
        int nb=0;
        List<Contrat>C=contratRepository.findContratByDateFinContratBetween(startDate,endDate);

        for(int i=0;i<C.size();i++){
            if(C.get(i).getArchive()==false){
                nb ++;
            }
        }
        return nb;
    }

    @Override
    public Set<Contrat> allContratBySpecialite(Specialite sp) {
        return  contratRepository.findContratsBySpecialite(sp);
    }

    @Override
    public Set<Contrat> allContratWithSameMontant(Integer montant) {
        return contratRepository.findContratsByMontantContrat(montant);
    }


}
