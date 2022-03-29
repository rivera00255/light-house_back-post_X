package com.jo.post.post.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

    private Long id;
    private Long categoryId;
    private String title;
    private String content;
    private String postImg;

    public PostDto(Long id, Long categoryId, String title, String content, String postImg) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.content = content;
        this.postImg = postImg;
    }
}
