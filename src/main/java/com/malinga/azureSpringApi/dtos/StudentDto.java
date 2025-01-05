package com.malinga.azureSpringApi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private boolean active;
}
