/**
 * 
 */
package org.maven.service;

import org.maven.dao.StudentDao;
import org.maven.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lokesh
 * 
 */
@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentDao dao;
	
	
	public Student saveStudent(String username, String password) {
		
		return dao.saveStudent(username, password);
	}

}
