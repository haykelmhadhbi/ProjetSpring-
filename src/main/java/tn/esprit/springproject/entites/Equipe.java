package tn.esprit.springproject.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;

    @OneToOne
    private DetailEquipe  Detail_equipe ;

    @ManyToMany( cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
