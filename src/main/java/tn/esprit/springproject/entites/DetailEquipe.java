package tn.esprit.springproject.entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDetailEquipe ;
    private Integer salle ;
    private String thematique ;

    @OneToOne(mappedBy = "Detail_equipe")
    private Equipe equipe;
}
