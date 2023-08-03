package com.example.response;

import com.example.domain.Student;
import com.example.domain.Subjects;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentResponse {

    private long id;

    private String firstName;

    private String lastName;

    private String address;

    private int age;

    private List<SubjectsResponse> listSubjects;

    private Student student;

    public StudentResponse(Student student){
        this.id =student.getId();
        this.firstName =student.getFirstName();
        this.lastName =student.getLastName();
        this.address =student.getAddress();
        this.age =student.getAge();
        this.student = student;
    }
}
