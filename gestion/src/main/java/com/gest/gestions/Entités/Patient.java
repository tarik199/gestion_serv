package com.gest.gestions.Entités;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gest.gestions.jpaauditing.auditingclasse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Patient extends auditingclasse<String> implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private  String prenom;
    @Column
    private  String nom;
    @Column
    private  int numcarte;
    @Column
    private  int nbre_de_visites;
    @JsonIgnore
    @ManyToOne(optional = true)

    private Hopital hopital;




}
