package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entites.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer > /*PagingAndSortingRepository //fiha tri w paginatioon */ {
}
