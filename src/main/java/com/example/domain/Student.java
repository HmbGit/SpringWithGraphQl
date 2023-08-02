package com.example.domain;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;
}
