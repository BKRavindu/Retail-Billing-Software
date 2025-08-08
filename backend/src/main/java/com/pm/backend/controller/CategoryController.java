package com.pm.backend.controller;

import com.pm.backend.Service.CategoryService;
import com.pm.backend.io.CategoryRequest;
import com.pm.backend.io.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest request) {
        return categoryService.add(request);

    }
}
