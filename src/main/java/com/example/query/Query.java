package com.example.query;

import com.example.domain.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private StudentService studentService;

	public String firstQuery () {
		return "First Query";
	}
	
	public String secondQuery () {
		return "Second Query";
	}

	public String fullName(String firstName, String lastName){
		return firstName + " "+ lastName;
	}

	public Student getStudent(Long id){

		return studentService.getStudent(id);
	}
}
