package tn.esprit.springproject.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur vide de cette classe
@AllArgsConstructor //constructer eli fih le parametre mtaa3i kol
@RequiredArgsConstructor // bech yemchi yamel constructeur avec les attribut eli mahtout fou9hom no null
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private  Date dateFinContrat ;
    @Enumerated(EnumType.STRING)
    @NonNull
    private Specialite specialite ;
    private Boolean archive ;
    private Integer montantContrat ;

    @ManyToOne
    Etudiant etudian;




}
