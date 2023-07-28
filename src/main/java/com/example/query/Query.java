package com.example.query;

import com.example.domain.Student;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	public String firstQuery () {
		return "First Query";
	}
	
	public String secondQuery () {
		return "Second Query";
	}

	public String fullName(String firstName, String lastName){
		return firstName + " "+ lastName;
	}

	public String getStudent(Student student){

		return student.getFirstName() + " " + student.getLastName();
	}
}
