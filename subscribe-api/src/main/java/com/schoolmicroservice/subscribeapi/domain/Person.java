package com.schoolmicroservice.subscribeapi.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;

    private Integer age;
    @Email
    private String email;
    @CPF
    @NotBlank
    private String cpf;
    @OneToOne(cascade=CascadeType.PERSIST)
    private Address address;
}
