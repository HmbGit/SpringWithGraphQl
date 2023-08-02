package com.example.response;

import com.example.domain.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {

    private long id;

    private String firstName;

    private String lastName;

    private String address;

    private int age;

    public StudentResponse(Student student){
        this.id =student.getId();
        this.firstName =student.getFirstName();
        this.lastName =student.getLastName();
        this.address =student.getAddress();
        this.age =student.getAge();
    }
}
