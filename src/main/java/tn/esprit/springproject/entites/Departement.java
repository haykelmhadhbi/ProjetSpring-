package tn.esprit.springproject.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder // constructeur personaliser nhot fih ay parametr nhebo alih w la 7ata parametr 7or ,on eliminer @nonnull  mtaa requireargsconstructer pas que on va ccree par exp deux construceur chacun aa un attribut unique
@ToString
//@Data : fiha lkol mais taml mochkl avec base de donner ki namlou serialstion ysir confilt w kol donc hiya tawdh les anotation kol ama nekhdmouch beha

public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)//on ne peut pas acceder en tant que setter
    private Integer idDepart ;
    private  String nomDepart ;


    @OneToMany  (cascade = CascadeType.ALL, mappedBy="depart")
    private Set<Etudiant> etdiant;
    //new Departement departement = Departement.builder().nomDepart("info").build();




}
