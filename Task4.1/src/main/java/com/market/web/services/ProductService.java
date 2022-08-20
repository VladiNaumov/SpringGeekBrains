package com.market.web.services;

import com.market.web.data.Product;
import com.market.web.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProdukts() {
        return productRepository.getAllProdukts();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void changeScore(Long studentId, Integer delta) {
        Product product = productRepository.findById(studentId);
        product.setScore(product.getScore() + delta);
        double alenuksen  = (product.getPrice() / 100) * product.getScore();
        product.setSumma(alenuksen);
        // studentRepository.save(student);
    }
}
