package com.naumdeveloper.hibernate.hw.version2.connect;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;



    public void init() {
        if(entityManagerFactory == null && entityManager == null) {
            this.entityManagerFactory = new Configuration().configure("hibernate.cfg.xml")
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