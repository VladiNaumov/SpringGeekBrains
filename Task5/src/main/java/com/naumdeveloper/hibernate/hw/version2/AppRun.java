package com.naumdeveloper.hibernate.hw.version2;


import com.naumdeveloper.hibernate.hw.version2.model.Product;
import com.naumdeveloper.hibernate.hw.version2.repository.ProductDao;

public class AppRun {



    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();

        productDao.save(new Product("LOL", 1200.00));
       /*
        productDao.update();
        productDao.delete();


        */



    }
}
