package com.geekbraims.hibernate.hw.SessionFactory;

import java.util.List;

public interface ProductDaoInterface {

    Product findById(Long id);
    Product findByName(String name);
    List<Product> findAll();
    void save(Product product);
    void updateNameById(Long id, String newName);
    void testCaching();
}
