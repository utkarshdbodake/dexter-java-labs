package com.utkarshbodake.student.persistence;

import com.utkarshbodake.student.entity.Student;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;
import com.github.rholder.retry.AttemptTimeLimiter;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.common.util.concurrent.TimeLimiter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


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
