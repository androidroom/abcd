/**
 * 
 */
package org.maven.controller;

import org.maven.model.Student;
import org.maven.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@RequestMapping("/index1")
	public ModelAndView viewPage() {

		return new ModelAndView("index");
	}

	@RequestMapping("/muragesg")
	public Student saveStudentController(@RequestParam String username, @RequestParam String password) {

		return service.saveStudent(username, password);
	}

}
