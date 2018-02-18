/**
 * 
 */
package org.maven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.maven.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.support.SessionFlashMapManager;

/**
 * @author Lokesh
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
		public Student saveStudent(String username, String password) {
	
		Session session = sessionFactory.openSession();
		
	Transaction tx = 	session.beginTransaction();
		
		Student n = new Student();
		
		n.setUsername(username);
		n.setPassword(password);
		
		session.save(n);
		
	tx.commit();
	session.close();
		System.out.println(n.getId());
		
		return n;
	}

}
