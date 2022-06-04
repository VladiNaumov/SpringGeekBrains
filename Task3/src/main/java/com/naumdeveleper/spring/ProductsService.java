package com.naumdeveleper.spring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService implements IProductsService{

    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Product> getItems() {
        return productsRepository.getItems();
    }

    @Override
    public void add(Product product) {
        productsRepository.add(product);

    }

    @Override
    public Optional<Product> findById(Long id) {
        return productsRepository.findById(id);
    }

    @Override
    public void removeAll() {
        productsRepository.removeAll();
    }

    @Override
    public boolean removeId(Long id) {
        return productsRepository.removeId(id);

    }
}
