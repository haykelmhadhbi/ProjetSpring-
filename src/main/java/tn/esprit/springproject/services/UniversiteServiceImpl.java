package tn.esprit.springproject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Contrat;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.ContratRepository;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;
import tn.esprit.springproject.repositories.UniversiteRespository;

import java.util.Date;
import java.util.List;
import java.util.Set;
@Service
@Slf4j

public class UniversiteServiceImpl implements IUniversiteService {


    UniversiteRespository universiteRespository;
    DepartementRepository departementRepository;
    EtudiantRepository etudiantRepository;
    ContratRepository contratRepository;
    public UniversiteServiceImpl (UniversiteRespository universiteRespository , DepartementRepository departementRepository,EtudiantRepository etudiantRepository , ContratRepository contratRepository ){
        this.universiteRespository=universiteRespository;
        this.departementRepository=departementRepository;
        this.etudiantRepository=etudiantRepository;
        this.contratRepository=contratRepository;
    }


    @Override

    public List<Universite> retrieveAllUniversite() {
        return  universiteRespository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRespository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return  universiteRespository.save(e) ;
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRespository.deleteById(id);

    }

    @Override
    public Universite retrieveUniversite(Integer id) {
        return universiteRespository.findById(id).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite Uni = universiteRespository.findById(idUniversite).orElse(null);
        Departement Dep = departementRepository.findById(idDepartement).orElse(null);
         Uni.getDepartment().add(Dep);

        universiteRespository.save(Uni);


    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        List <Contrat> CL = contratRepository.getContratByDate(startDate , endDate);
        Integer SommMontant =0;

        if (CL.isEmpty()){
            System.out.println("The collection is empty");
        }
        else {

            for (int i =0 ; i<CL.size(); i++) {

                if (CL.get(i).getSpecialite().equals("IA")) {
                     CL.get(i).setMontantContrat(300);

                } else if (CL.get(i).getSpecialite().equals("RESEAUX")) {
                    CL.get(i).setMontantContrat(350);

                } else if (CL.get(i).getSpecialite().equals("CLOUD")) {
                    CL.get(i).setMontantContrat(400);

                } else if (CL.get(i).getSpecialite().equals("SECURITE")) {
                    CL.get(i).setMontantContrat(450);

                }
                SommMontant+= CL.get(i).getMontantContrat();
        }

    }

        return  (float) SommMontant;
    }

}
