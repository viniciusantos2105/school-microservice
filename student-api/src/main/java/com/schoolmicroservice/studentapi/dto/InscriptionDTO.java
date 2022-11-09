package com.schoolmicroservice.studentapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class InscriptionDTO {

    private Long courseId;
    private Long studentId;
}
