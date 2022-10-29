package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "detail_equipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_equipe")
    private Integer idDetailEquipe ;
    private Integer salle ;
    private String thematique ;

    @OneToOne(mappedBy = "Detail_equipe")
   // @JsonIgnore//j'ai ignorer le type json fi equipe djibli detail equipe ema fi detail equipe madjiblich equipe
    private Equipe equipe;
}
