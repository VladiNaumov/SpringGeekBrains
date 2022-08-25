package com.naumdeveloper.hibernate.hw.version2.connect;

import com.naumdeveloper.hibernate.hw.version2.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;

public class ManagerFactoryUtil {

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    public void init() {
        entityManagerFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        this.entityManager = entityManagerFactory.createEntityManager();

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void shutdown() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
