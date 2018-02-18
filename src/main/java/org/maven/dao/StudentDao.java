/**
 * 
 */
package org.maven.dao;

import org.maven.model.Student;

public interface StudentDao {

	
	Student saveStudent(String username ,String password);
}
