package com.schoolmicroservice.studentapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Person person;
    //Lista de materias do estudante - private List<Course> listCourses;
    //Unidade do estudante - private Unit unit;
    //Curso que o aluno faz - private UndergraduateCourse undergraduateCourse;

}
