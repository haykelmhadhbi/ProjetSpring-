package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

//@Builder // constructeur personaliser nhot fih ay parametr nhebo alih w la 7ata parametr 7or ,on eliminer @nonnull  mtaa requireargsconstructer pas que on va ccree par exp deux construceur chacun aa un attribut unique
@ToString
//@Data : fiha lkol mais taml mochkl avec base de donner ki namlou serialstion ysir confilt w kol donc hiya tawdh les anotation kol ama nekhdmouch beha

public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Setter(AccessLevel.NONE)//on ne peut pas acceder en tant que setter
    //@Column(name = "id_dep")

    private Integer idDepart ;
   @NonNull
    private  String nomDepart ;


    @OneToMany  (cascade = CascadeType.ALL, mappedBy="depart")
    @LazyCollection(LazyCollectionOption.FALSE)

    @JsonIgnore
    private Set<Etudiant> etdiant;


   //  Departement departement = Departement.builder().nomDepart("info").build();




}
