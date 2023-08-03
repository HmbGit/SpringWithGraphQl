package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.domain.Subjects;
import com.example.response.StudentResponse;
import com.example.response.SubjectsResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectsResponse> getListSubjects (StudentResponse studentResponse) {

        List<SubjectsResponse> listSubjects = new ArrayList<SubjectsResponse>();

        if (studentResponse.getStudent() != null){
            for (Subjects sub: studentResponse.getStudent().getListSubjects()){
                listSubjects.add(new SubjectsResponse(sub));
            }
        }
        return listSubjects;
    }
}
