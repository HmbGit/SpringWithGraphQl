package com.example.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Subjects.
 */
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder
public class Subjects implements Serializable {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "SUBJECT")
    private String subject;

    @JoinColumn(name = "Student_id")
    @ManyToOne
    private Student student;
}
