package com.example.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.domain.Subjects;
import com.example.enumerate.SubjectNameEnum;
import com.example.response.StudentResponse;
import com.example.response.SubjectsResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectsResponse> getListSubjects (StudentResponse studentResponse,
                                                   SubjectNameEnum subjectNameEnum) {

        List<SubjectsResponse> listSubjects = new ArrayList<>();

        if (studentResponse.getStudent().getListSubjects() != null){
            for (Subjects sub: studentResponse.getStudent().getListSubjects()){
                if (subjectNameEnum.name().equalsIgnoreCase(sub.getSubject()))
                listSubjects.add(new SubjectsResponse(sub));
                else if (subjectNameEnum.name().equalsIgnoreCase("ALL"))
                    listSubjects.add(new SubjectsResponse(sub));
            }
        }
        return listSubjects;
    }
}
