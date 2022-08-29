package com.geekbraims.hibernate.hw.SessionFactory;

public class RunApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDaoInterface productDao = new ProductDao(sessionFactoryUtils);
            productDao.testCaching();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
