package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository <Equipe ,Integer > {
}
