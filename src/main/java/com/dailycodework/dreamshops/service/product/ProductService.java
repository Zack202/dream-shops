package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.exceptions.ProductNotFoundException;
import com.dailycodework.dreamshops.model.Product;
import com.dailycodework.dreamshops.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(()-> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0;
    }
}