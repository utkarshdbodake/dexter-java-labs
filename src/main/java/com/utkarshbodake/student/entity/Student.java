package com.utkarshbodake.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Student {

    @NonNull private long id;
    private String name;
}
