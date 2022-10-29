package tn.esprit.springproject.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUniv ;

    @Column(name = "nom_de_Universite")
    private String nomUniv ;

    @OneToMany(cascade = CascadeType.ALL)

    private Set<Departement> department;

}
