package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "T_Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "id")
    private Integer idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;

    //@JsonIgnore
    @OneToOne( cascade = CascadeType.ALL)//ki nzid equipe nzid maha detail equipe
    private DetailEquipe  Detail_equipe ;
    //@JsonIgnore
    @ManyToMany ( cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
