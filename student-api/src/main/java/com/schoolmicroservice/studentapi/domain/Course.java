package com.schoolmicroservice.studentapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;
    private String name;
    private String startTime;
    private String endTime;
    private Double price;

}
