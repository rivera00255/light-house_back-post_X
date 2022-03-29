package com.jo.post.postImg;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PostImg {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String url;
}
