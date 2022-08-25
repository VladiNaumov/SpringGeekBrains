package com.geekbraims.hibernate.hw.version2;


import com.geekbraims.hibernate.hw.version2.model.Product;
import com.geekbraims.hibernate.hw.version2.connect.ManagerFactoryUtil;
import com.geekbraims.hibernate.hw.version2.repository.ProductDao;

public class AppRun {

    public static void main(String[] args) {

        ManagerFactoryUtil managerFactoryUtil = new ManagerFactoryUtil();
         try {
            ProductDao productDao = new ProductDao();

            productDao.save(new Product("WERTYDSFSFSFsdfghjklölkjhgf", 1200.00));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managerFactoryUtil.shutdown();
        }

    }
}