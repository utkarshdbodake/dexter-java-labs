package com.utkarshbodake.posts.service;

import com.utkarshbodake.posts.entity.Post;
import com.utkarshbodake.posts.persistence.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostDao postDao;

    public List<Post> getPosts() {
        return postDao.getAll();
    }
}
