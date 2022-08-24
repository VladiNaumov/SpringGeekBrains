package com.naumdeveloper.hibernate.hw.version2.repository;

import com.naumdeveloper.hibernate.hw.version2.connect.HibernateSessionFactory;
import com.naumdeveloper.hibernate.hw.version2.model.Product;

import java.util.List;

public class ProductDao {

/*
Задание
1. Создайте сущность Product (Long id, String title, int price) и таблицу в базе данных для хранения объектов этой сущности;
2. Создайте класс ProductDao и реализуйте в нем логику выполнения CRUD-операций над сущностью Product (Product findById(Long id), List<Product> findAll(), void deleteById(Long id), Product saveOrUpdate(Product product));
3. * Вшить ProductDao в веб-проект, и показывать товары, лежащие в базе данных. Помните что в таком случае SessionFactory или обертку над ней надо будет делать в виде Spring бина.
Дополнительные материалы
 */

    private HibernateSessionFactory hibernateSessionFactory;
    private Product product;


    public ProductDao() {
        hibernateSessionFactory = new HibernateSessionFactory();
        hibernateSessionFactory.init();

        product = new Product();
    }

    public Product findById(int id) {
        product = hibernateSessionFactory.getEntityManager().find(Product.class, id);
        hibernateSessionFactory.close();
        return product;

    }


    public void save(Product product) {
        /* INSERT */
        hibernateSessionFactory.getEntityManager().getTransaction().begin();
        hibernateSessionFactory.getEntityManager().persist(product);
        hibernateSessionFactory.getEntityManager().getTransaction().commit();
        hibernateSessionFactory.close();


    }

    public void update(int id, String name) {
        // UPDATE
        hibernateSessionFactory.getEntityManager().getTransaction().begin();
        product = hibernateSessionFactory.getEntityManager().find(Product.class, id);
        product.setName(name);
        hibernateSessionFactory.getEntityManager().getTransaction().commit();

        /*
        session.getEntityManager().getTransaction().begin();
        Product product1 = new Product("User2New", 3.0);
        product1.setId(2L);
        session.getEntityManager().merge(product1);
        session.getEntityManager().getTransaction().commit();
         */
        hibernateSessionFactory.close();

    }


    public void delete(int id) {
        // DELETE
        hibernateSessionFactory.getEntityManager().getTransaction().begin();
        product = hibernateSessionFactory.getEntityManager().find(Product.class, id);
        hibernateSessionFactory.getEntityManager().remove(product);
        hibernateSessionFactory.getEntityManager().getTransaction().commit();
        hibernateSessionFactory.close();

    }

    public List<Product> findAll() {
         List<Product> product = hibernateSessionFactory
                 .getEntityManager()
                 .createQuery("\"select u from Product u", Product.class).getResultList();

        hibernateSessionFactory.close();
        return product;

    }


}
