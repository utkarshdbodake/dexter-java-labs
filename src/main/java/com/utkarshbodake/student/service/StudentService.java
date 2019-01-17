package com.utkarshbodake.student.service;

import com.utkarshbodake.student.entity.Student;
import com.utkarshbodake.student.persistence.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student[] getStudents() {
        return studentDao.getAll();

        // https://jsonplaceholder.typicode.com/users
    }

    public Student getStudent(String id) {
        return studentDao.get(id);
    }
}
