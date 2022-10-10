package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Equipe;

public interface EquipeRepository extends JpaRepository <Equipe ,Integer > {
}
