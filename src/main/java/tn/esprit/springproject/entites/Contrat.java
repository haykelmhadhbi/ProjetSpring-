package tn.esprit.springproject.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat ;
    @Temporal(TemporalType.DATE)
    private  Date dateFinContrat ;
    @Enumerated(EnumType.STRING)
    private Specialite specialite ;
    private Boolean archive ;
    private Integer montantContrat ;

    @ManyToOne
    Etudiant etudian;




}
