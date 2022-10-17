package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Universite;

@Repository

public interface UniversiteRespository extends JpaRepository<Universite, Integer> {
}
