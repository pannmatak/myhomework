package com.rupp.homework.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.rupp.homework.dto.PageableDto;
import com.rupp.homework.dto.StudentDto;

@Repository
public interface StudentDao {
	int save(StudentDto student);
	List<StudentDto> getAll();
	int countStudentById(@Param("stu_code") String id);
	int editById(StudentDto student);
	int deleteById(@Param("stu_code") String id);
	
	List<StudentDto> getPageable(PageableDto pageable);
	int getRecords();
}
