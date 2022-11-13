package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Professeur implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idProfesseur ;
    private String prenomP;
    //@NonNull
    private String nomP;

    @Enumerated(EnumType.STRING)
    private  Matiere matiere;
    private Integer nbrHeursParJr;
    private  Integer nbrJours;
    private  Boolean conge;

    //@JsonIgnore
    @ManyToMany( cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;




}
