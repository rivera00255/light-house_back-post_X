package com.jo.post.postImg;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostImgRepository extends JpaRepository<PostImg, Long> {

    List<PostImg> findAll();
}
