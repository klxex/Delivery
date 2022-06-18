package com.hwan.delivery.service;


import com.hwan.delivery.domain.Post;
import com.hwan.delivery.dto.PostRequestDto;
import com.hwan.delivery.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;


@RequiredArgsConstructor
@Service
public class PostServiceImpl {
    private final PostRepository postRepository;


    public Page<Post> getAllPost(Pageable pageable){
        Page<Post> page = postRepository.findAll(pageable);
        return page;
    }

    public Post getPost(Long id){
        return postRepository.findById(id).get();
    }


    public void updatePost(){

    }

    public void createPost(PostRequestDto postRequestDto){

    }

    public void deletePost(PostRequestDto postRequestDto){

    }


}
