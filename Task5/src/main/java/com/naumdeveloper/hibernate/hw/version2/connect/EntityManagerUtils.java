package com.naumdeveloper.hibernate.hw.version2.connect;

import com.naumdeveloper.hibernate.hw.version2.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;

public class EntityManagerUtils {

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;



    public void init() {
        if(entityManagerFactory == null) {
            this.entityManagerFactory = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Product.class)
                    .buildSessionFactory();

            this.entityManager = entityManagerFactory.createEntityManager();
        }

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void close(){
        entityManager.close();
        entityManagerFactory.close();
    }

}