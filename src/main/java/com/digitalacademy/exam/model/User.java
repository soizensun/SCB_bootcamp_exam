package com.digitalacademy.exam.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Integer age;
    private String telephone;
    private String graduatedForm;
    private String grade;
    private String major;
    private String job;
}
