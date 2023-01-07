package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //    API Layer
    @GetMapping
    public List<Student> getStudent () {
        return studentService.getStudents();
    }

    @PostMapping
//    take the request body and map to student
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path =  "{studentId}")
    public void deleteStudent (@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
