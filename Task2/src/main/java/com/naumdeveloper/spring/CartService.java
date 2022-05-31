package com.naumdeveloper.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class CartService {
    private ProductRepository productRepository;
    private Cart cart;

    @PostConstruct
    public void CartServiceInit(){
        this.cart = new Cart();
    }

    public Cart getCurrentCart(){
        return cart;
    }

    @Autowired
    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addToCartByProductId(Long productId){
    Product product = productRepository.findById(productId).get();
    cart.add(product);
    }

    public void removeFromCart(String productTitle){
        cart.remove(productTitle);

    }

}
