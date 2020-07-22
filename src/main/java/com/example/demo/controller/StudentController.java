
package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

	@GetMapping("/add")
	public List<Student> add(
	        @RequestParam(value = "name", defaultValue = "World") String name,
            @RequestParam(value = "passportNumber", defaultValue = "no passport") String passportNumber
    ) {
        studentService.addStudent(name, passportNumber);
        return studentService.findAll();
//        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//        PreparedStatement statement = connection.prepareStatement("select * from student");
//        ResultSet resultSet = statement.executeQuery();
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String name1 = resultSet.getString("name");
//            System.out.println(id + name1);
//        }
//        resultSet.close();
//        statement.close();
//        connection.close();
	}

	@GetMapping(value = "/all")
    public List<Student> all(){
        return studentService.findAll();
    }

//	@Scheduled(fixedDelay = 1000)
//	public void inc() {
//		counter.incrementAndGet();
//	}
}
            