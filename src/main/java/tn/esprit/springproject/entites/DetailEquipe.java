package tn.esprit.springproject.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDetailEquipe ;
    private Integer salle ;
    private String thematique ;

    @OneToOne(mappedBy = "Detail_equipe")
    private Equipe equipe;
}
