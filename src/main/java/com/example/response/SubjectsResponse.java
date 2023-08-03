package com.example.response;

import com.example.domain.Subjects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectsResponse {

    private Long id;

    private String subject;

    public SubjectsResponse(Subjects subject){
        this.id = subject.getId();
        this.subject= subject.getSubject();
    }
}
