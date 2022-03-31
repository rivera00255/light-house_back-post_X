package com.jo.post.postImg;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class PostImg {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String url;

    @Builder
    public PostImg(Long id, String url){
        this.id = id;
        this.url = url;
    }
}
