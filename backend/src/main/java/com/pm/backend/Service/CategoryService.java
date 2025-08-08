package com.pm.backend.Service;


import com.pm.backend.io.CategoryRequest;
import com.pm.backend.io.CategoryResponse;
import org.springframework.stereotype.Service;


@Service
public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

}
