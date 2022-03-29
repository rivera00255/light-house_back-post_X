package com.jo.post.post.model;

import com.jo.post.category.model.CategoryEntity;
import com.jo.post.util.BaseTime;
import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity
public class Post extends BaseTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    private String postImg;


    @Builder
    public Post(Long id, CategoryEntity category, String title, String content, String postImg) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.content = content;
        this.postImg = postImg;
    }
}
