package com.utkarshbodake.student.persistence;

import com.utkarshbodake.student.entity.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    private List<Student> students;

    public StudentDao() {
        students = new ArrayList<>();
        students.add(new Student(1, "Utkarsh"));
        students.add(new Student(2, "Piyush"));
        students.add(new Student(3, "Atharva"));
    }

    public List<Student> getAll() {
        return students;
    }

    public Student get(long id) {
        return new Student(id, "Mathew");
    }

    public boolean insert(Student student) {
        return students.add(student);
    }
}
