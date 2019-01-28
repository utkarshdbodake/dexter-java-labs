package com.utkarshbodake.student.service;

import com.utkarshbodake.student.entity.Student;
import com.utkarshbodake.student.persistence.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents() {
        return studentDao.getAll();
    }

    public Student getStudent(long id) {
        return studentDao.get(id);
    }

    public boolean createStudent(Student student) {
        return studentDao.insert(student);
    }
}
