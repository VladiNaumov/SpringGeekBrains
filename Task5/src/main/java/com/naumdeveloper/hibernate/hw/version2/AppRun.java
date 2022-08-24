package com.naumdeveloper.hibernate.hw.version2;


import com.naumdeveloper.hibernate.hw.version2.connect.HibernateSessionFactory;
import com.naumdeveloper.hibernate.hw.version2.repository.ProductDao;

public class AppRun {



    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        System.out.println(productDao.findById(16));
       /*


        productDao.update(13, "DEMO");
        productDao.delete(18);

        */



    }
}
