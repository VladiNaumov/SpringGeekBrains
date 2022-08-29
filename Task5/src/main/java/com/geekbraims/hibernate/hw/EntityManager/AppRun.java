package com.geekbraims.hibernate.hw.EntityManager;


import com.geekbraims.hibernate.hw.EntityManager.model.Product;
import com.geekbraims.hibernate.hw.EntityManager.connect.ManagerFactoryUtil;
import com.geekbraims.hibernate.hw.EntityManager.repository.ProductDao;

public class AppRun {

    public static void main(String[] args) {

        ManagerFactoryUtil factoryUtil = new ManagerFactoryUtil();
         try {
            ProductDao productDao = new ProductDao(factoryUtil);

            productDao.save(new Product("HEROCU....", 1000200.00));
            System.out.println(productDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factoryUtil.shutdown();
        }

    }
}
