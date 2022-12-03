package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.entites.Professeur;
import tn.esprit.springproject.repositories.DepartementRepository;
import tn.esprit.springproject.repositories.EtudiantRepository;
import tn.esprit.springproject.repositories.ProfesseurRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ProfesseurServiceImpl implements IProfesseurService {

    ProfesseurRepository professeurRepository ;
    EtudiantRepository etudiantRepository;
    DepartementRepository  departementRepository;
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

    @Override
    public Set<Professeur> getAllProfByDepartment(String nomDepa) {
      /* Set <Etudiant> setEt = etudiantRepository.getEtudwithNamdepa(nomDepa);
           for (Etudiant et : setEt) {
               return et.getProfesseurs();
           }*/
        return  professeurRepository.getEtudwithNamdepa(nomDepa);



       /*Set <Departement> depSet = departementRepository.getDepawithnamedep(nomDepa);

        for (Departement d : depSet){
                for (Etudiant et : d.getEtdiant()){
                    return  et.getProfesseurs();
                }
            }*/



    }

    @Override
    public Set <Professeur> getProfByNamEtud(String NamEt) {
        Etudiant et = etudiantRepository.findEtudiantByNomE(NamEt);
        return  et.getProfesseurs();

    }


}
