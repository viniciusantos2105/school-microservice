package com.schoolmicroservice.studentapi.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "person_id")
    private Long person_id;
    private String name;
    private Integer age;
    private String email;
    private String cpf;
    @OneToOne(cascade=CascadeType.PERSIST)
    private Address address;

}
