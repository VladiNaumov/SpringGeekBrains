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

    public void changeDiscount(Long productId, Integer delta) {
        Product product = productRepository.findById(productId);
        product.setDiscount(product.getDiscount() + delta);
        double discoun  = (product.getPrice() / 100) * product.getDiscount();
        String formattedDouble = String.format("%.2f", discoun);

        product.setSumma(formattedDouble);

        // studentRepository.save(student);

    }

    public void add(Product product) {
        productRepository.add(product);

    }
}
