/**
 * 
 */
package org.maven.service;

import org.maven.model.Student;

/**
 * @author Lokesh
 */
public interface StudentService {

	
	Student saveStudent(String username, String password);

}
