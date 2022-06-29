package com.pelinhangisi.productservice.controller;


import com.pelinhangisi.productservice.dto.ProductRequest;
import com.pelinhangisi.productservice.dto.ProductResponse;
import com.pelinhangisi.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // Product creat etmek için oluşturulan kısım
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        productService.getAllProducts();
    }

}
