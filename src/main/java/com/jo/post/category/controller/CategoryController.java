package com.jo.post.category.controller;

import com.jo.post.category.model.CategoryEntity;
import com.jo.post.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/category")
    public CategoryEntity addCategory(@RequestBody CategoryEntity category){
        return categoryService.addCategory(category);
    }

    @GetMapping("/category")
    public List<CategoryEntity> getAll(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/category/{id}")
    public CategoryEntity getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id).get();
    }
}
