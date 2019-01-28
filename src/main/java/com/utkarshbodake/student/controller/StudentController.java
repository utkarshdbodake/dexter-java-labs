package com.utkarshbodake.student.controller;

import com.utkarshbodake.posts.entity.Post;
import com.utkarshbodake.posts.service.PostService;
import com.utkarshbodake.student.annotation.UserRequired;
import com.utkarshbodake.student.entity.CurrentUser;
import com.utkarshbodake.student.entity.Student;
import com.utkarshbodake.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    CurrentUser currentUser;

    @Autowired
    private StudentService studentService;

    @Autowired
    private PostService postService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @UserRequired
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.getStudent(id);
    }

    @UserRequired
    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @UserRequired
    @GetMapping("/{studentId}/posts")
    public List<Post> getPosts(@PathVariable long studentId) {
        System.out.println(studentId);
        return postService.getPosts();
    }
}
