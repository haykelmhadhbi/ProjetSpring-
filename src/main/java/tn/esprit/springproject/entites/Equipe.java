package tn.esprit.springproject.entites;

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
@Table(name = "T_Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idEquipe ;
    @Column(name = "nom")
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    @Column(name = "n")
    private Niveau niveau ;

    @OneToOne( cascade = CascadeType.ALL)//ki nzid equipe nzid maha detail equipe
    private DetailEquipe  Detail_equipe ;

    @ManyToMany //( cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
