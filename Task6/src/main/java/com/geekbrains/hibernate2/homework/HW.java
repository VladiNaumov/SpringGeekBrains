package com.geekbrains.hibernate2.homework;


import com.geekbrains.hibernate2.homework.daoService.Dao;
import com.geekbrains.hibernate2.homework.model.Customer;
import com.geekbrains.hibernate2.homework.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;


public class HW {
    public static void main(String[] args) {

         // Получаем фабрику менеджеров сущностей
        EntityManagerFactory entityManagerFactory = new Configuration()
                .configure("hw_hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                 .addAnnotatedClass(Product.class)
                .buildSessionFactory();
        // Из фабрики создаем EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Dao dao = new Dao(entityManagerFactory);





        entityManager.close();
        entityManagerFactory.close();

    }
}
