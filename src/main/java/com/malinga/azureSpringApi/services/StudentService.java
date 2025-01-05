package com.malinga.azureSpringApi.services;

import com.malinga.azureSpringApi.dtos.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    //students list
    public List<StudentDto> students(){
        List<StudentDto> students = new ArrayList<>();
        students.add(new StudentDto(
                1,
                "Malinga Simuchimba",
                29,
                "Male",
                "FLAT 24 GAYWAY COURT LONGARCES",
                "260975608340",
                "malinga.simuchimba@gmail.com",
                true
        ));
        return students;
    }
}
