package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.springproject.entites.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer > /*PagingAndSortingRepository //fiha tri w paginatioon */ {
}
