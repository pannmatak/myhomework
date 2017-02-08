package com.rupp.homework.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rupp.homework.dao.StudentDao;
import com.rupp.homework.dto.PageableDto;
import com.rupp.homework.dto.StudentDto;
import com.rupp.homework.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public int save(StudentDto student) {
		return studentDao.save(student);
	}

	@Override
	public List<StudentDto> getAll() {
		return studentDao.getAll();
	}

	@Override
	public int countStudentById(String id) {
		return studentDao.countStudentById(id);
	}

	@Override
	public int editById(StudentDto student) {
		return studentDao.editById(student);
	}

	@Override
	public int deleteById(String id) {
		return studentDao.deleteById(id);
	}

	@Override
	public List<StudentDto> getPageable(PageableDto pageable) {
		return studentDao.getPageable(pageable);
	}

	@Override
	public int getRecords() {
		return studentDao.getRecords();
	}

}
