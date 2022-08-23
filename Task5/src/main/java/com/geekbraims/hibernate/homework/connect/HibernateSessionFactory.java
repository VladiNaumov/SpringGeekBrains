package com.geekbraims.hibernate.homework.connect;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

    private EntityManager entityManager;
    EntityManagerFactory entityManagerFactory;

    public HibernateSessionFactory() {
        if(entityManager == null) {
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