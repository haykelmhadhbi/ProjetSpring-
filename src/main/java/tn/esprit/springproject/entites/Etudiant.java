package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Etudiant implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String prenomE;
    @NonNull
    private String nomE;
    private Integer ageE;
    private String emailE;


    @Enumerated(EnumType.STRING)
    private Option opt ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy ="etudian" )
    private Set<Contrat> contrats;
    private String sexe;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDepart")
    Departement depart;
    @JsonIgnore
    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    private Set<Professeur> professeurs;

}



