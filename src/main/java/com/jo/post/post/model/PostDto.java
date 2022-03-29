package com.jo.post.post.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

    private Long id;
    private String category;
    private String title;
    private String content;
    private String postImg;

    public PostDto(Long id, String category, String title, String content, String postImg) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.content = content;
        this.postImg = postImg;
    }
}
