package Main.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Main.Model.Student;
import Main.Repository.StudentInterface;

@RestController
public class StudentController {

	
	@Autowired
	private StudentInterface studentRepo;
	

	@SuppressWarnings("unchecked")
	@RequestMapping("/findbyname/{name}")
	public Student findUserByname(@PathVariable String name) {
	Student student =  studentRepo.findJonDoe(name);
	
	return student;
	}
	

}
