package com.rupp.homework.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rupp.homework.dto.StudentDto;
import com.rupp.homework.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student")
	public String getStudentPage(){
		return "student";
	}
	
	@RequestMapping(value="/api/students", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentDto> getStudent(){
		return studentService.getAll();
	}
	
	

}
