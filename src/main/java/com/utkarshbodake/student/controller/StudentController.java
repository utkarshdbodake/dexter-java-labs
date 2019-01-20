package com.utkarshbodake.student.controller;

import com.utkarshbodake.student.entity.CurrentUser;
import com.utkarshbodake.student.entity.Student;
import com.utkarshbodake.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    CurrentUser currentUser;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Student[] getStudents() {
        return studentService.getStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }
}
