package com.utkarshbodake.posts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    long userId;
    long id;
    String title;
    String body;
}
