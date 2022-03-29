package com.jo.post.post.service;

import com.jo.post.post.model.Post;
import com.jo.post.post.model.PostDto;
import com.jo.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Transactional
    @Override
    public void savePost(PostDto postDto) {
        log.info("addPost");
        postRepository.save(Post.builder()
                .id(null)
                .category(postDto.getCategory())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .postImg(postDto.getPostImg())
                .build());
    }

    @Transactional
    @Override
    public List<Post> findAllPost() {
        return postRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Post> findById(Long id) {
        log.info("find by post id : {}", id);
        return Optional.ofNullable(postRepository.findById(id).get());
    }

    @Transactional
    @Override
    public void editPost(Long id, PostDto postDto) {
        log.info("edit post {}.", postRepository.findById(postDto.getId()));
        if(postRepository.findById(id).isPresent()){ //id 값이 있는지 확인부터 해보기
            Post post = Post.builder()
                    .id(postDto.getId())
                    .category(postDto.getCategory())
                    .title(postDto.getTitle())
                    .content(postDto.getContent())
                    .postImg(postDto.getPostImg())
                    .build();
            postRepository.save(post);
        }else {
            log.error("edit post category error.");
        }
    }

    @Transactional
    @Override
    public void delPost(Long id) {
        if (postRepository.findById(id).isPresent()){
            log.info("delete Post by id");
            postRepository.deleteById(id);
        }else {
            log.error("delete Post error.");
        }


    }
}
