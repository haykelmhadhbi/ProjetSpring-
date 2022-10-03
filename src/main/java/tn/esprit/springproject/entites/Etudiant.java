package tn.esprit.springproject.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String prenomE;
    @Enumerated(EnumType.STRING)
    private Option opt ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy ="etudian" )
    private Set<Contrat> contrats;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @ManyToOne
    Departement depart;

}



