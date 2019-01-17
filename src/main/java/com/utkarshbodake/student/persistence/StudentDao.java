package com.utkarshbodake.student.persistence;

import com.utkarshbodake.student.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    public Student[] getAll() {

        Student[] students = new Student[] {
                new Student("1", "Utkarsh"),
                new Student("2", "Piyush"),
                new Student("3", "Atharva"),
        };

        return students;
    }

    public Student get(String id) {

        return new Student(id, "Mathew");
    }
}
