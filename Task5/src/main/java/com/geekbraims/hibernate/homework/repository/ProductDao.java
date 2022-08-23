package com.geekbraims.hibernate.homework.repository;

import com.geekbraims.hibernate.homework.connect.HibernateSessionFactory;
import com.geekbraims.hibernate.homework.model.Product;

import java.util.List;

public class ProductDao {

/*
Задание
1. Создайте сущность Product (Long id, String title, int price) и таблицу в базе данных для хранения объектов этой сущности;
2. Создайте класс ProductDao и реализуйте в нем логику выполнения CRUD-операций над сущностью Product (Product findById(Long id), List<Product> findAll(), void deleteById(Long id), Product saveOrUpdate(Product product));
3. * Вшить ProductDao в веб-проект, и показывать товары, лежащие в базе данных. Помните что в таком случае SessionFactory или обертку над ней надо будет делать в виде Spring бина.
Дополнительные материалы
 */

    HibernateSessionFactory session;
    Product product;


    public ProductDao() {
        session = new HibernateSessionFactory();
        product = new Product();
    }

    public Product findById(int id) {
        return product = session.getEntityManager().find(Product.class, id);
    }


    public void save(Product product) {
        /* INSERT */
        session.getEntityManager().getTransaction().begin();
        session.getEntityManager().persist(product);
        session.getEntityManager().getTransaction().commit();

    }

    public void update(int id, String name) {
        // UPDATE
        session.getEntityManager().getTransaction().begin();
        product = session.getEntityManager().find(Product.class, id);
        product.setName(name);
        session.getEntityManager().getTransaction().commit();

        /*
        session.getEntityManager().getTransaction().begin();
        Product product1 = new Product("User2New", 3.0);
        product1.setId(2L);
        session.getEntityManager().merge(product1);
        session.getEntityManager().getTransaction().commit();
         */
    }


    public void delete(int id) {
        // DELETE
        session.getEntityManager().getTransaction().begin();
        product = session.getEntityManager().find(Product.class, id);
        session.getEntityManager().remove(product);
        session.getEntityManager().getTransaction().commit();

    }

    public List<Product> findAll() {
        return null;

    }


}
