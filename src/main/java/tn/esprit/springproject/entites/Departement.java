package tn.esprit.springproject.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart ;
    private  String nomDepart ;


    @OneToMany  (cascade = CascadeType.ALL, mappedBy="depart")
    private Set<Etudiant> etdiant;

    @ManyToOne
    Universite universite;


}
