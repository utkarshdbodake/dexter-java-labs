package com.utkarshbodake.student.aspect;

import com.utkarshbodake.student.entity.CurrentUser;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserCheckerAspect {

    @Autowired
    private CurrentUser currentUser;
}
