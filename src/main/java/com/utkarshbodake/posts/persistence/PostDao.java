package com.utkarshbodake.posts.persistence;

import com.utkarshbodake.posts.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PostDao {

    public List<Post> getAll() {
        return Arrays.asList();
    }
}
