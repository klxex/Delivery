package com.hwan.delivery.controller;

import com.hwan.delivery.domain.Post;
import com.hwan.delivery.service.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostRestController {
    private final PostServiceImpl postService;

    public void create(){

    }

    @GetMapping("/posts")
    public Page<Post> findAll(Pageable pageable){

       return postService.getAllPost(pageable);
    }

    @GetMapping("/posts/{id}")
    public  find(@PathVariable("id") Long id){

    }

    public void update(){

    }

    public void delete(){

    }

}
