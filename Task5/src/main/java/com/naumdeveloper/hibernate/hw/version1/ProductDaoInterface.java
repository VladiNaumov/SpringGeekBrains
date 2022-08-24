package com.naumdeveloper.hibernate.hw.version1;

import java.util.List;

public interface ProductDaoInterface {

    Product findById(Long id);
    Product findByName(String name);
    List<Product> findAll();
    void save(Product product);
    void updateNameById(Long id, String newName);
    void testCaching();
}
