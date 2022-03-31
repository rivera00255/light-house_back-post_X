package com.jo.post.postImg;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
public class PostImgDto {

    private Long id;
    private String url;
    private String imgFullPath;

    public PostImg toEntity(){
        PostImg build = PostImg.builder()
                .id(id)
                .url(url)
                .build();
        return build;
    }

    @Builder
    public PostImgDto(Long id, String url, String imgFullPath) {
        this.id = id;
        this.url = url;
        this.imgFullPath = imgFullPath;
    }
}
