
package com.example.controller;

import com.example.model.Product;
@RestController
public class ProductController {


    @GetMapping("/products")
    public ArrayList<Product> getAllProducts(){
        return  new ArrayList<>();
    }

    @PostMapping("/products")
    public ArrayList<Product> AddProduct(@RequestBody Product product){
        return  product;
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        return  product;
    }
}