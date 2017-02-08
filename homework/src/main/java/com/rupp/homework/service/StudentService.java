package com.rupp.homework.service;

import java.util.List;
import com.rupp.homework.dto.PageableDto;
import com.rupp.homework.dto.StudentDto;

public interface StudentService {
	int save(StudentDto student);
	List<StudentDto> getAll();
	int countStudentById(String id);
	int editById(StudentDto student);
	int deleteById(String id);
	
	List<StudentDto> getPageable(PageableDto pageable);
	int getRecords();
}
