package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Universite;

import java.util.Set;

@Repository

public interface UniversiteRespository extends JpaRepository<Universite, Integer> {


}
