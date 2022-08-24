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

    private HibernateSessionFactory sesshibernateSessionFactoryon;
    private Product product;


    public ProductDao() {
        sesshibernateSessionFactoryon = new HibernateSessionFactory();
        sesshibernateSessionFactoryon.init();

        product = new Product();
    }

    public Product findById(int id) {
        product = sesshibernateSessionFactoryon.getEntityManager().find(Product.class, id);
        sesshibernateSessionFactoryon.close();
        return product;

    }


    public void save(Product product) {
        /* INSERT */
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().begin();
        sesshibernateSessionFactoryon.getEntityManager().persist(product);
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().commit();
        sesshibernateSessionFactoryon.close();


    }

    public void update(int id, String name) {
        // UPDATE
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().begin();
        product = sesshibernateSessionFactoryon.getEntityManager().find(Product.class, id);
        product.setName(name);
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().commit();

        /*
        session.getEntityManager().getTransaction().begin();
        Product product1 = new Product("User2New", 3.0);
        product1.setId(2L);
        session.getEntityManager().merge(product1);
        session.getEntityManager().getTransaction().commit();
         */
        sesshibernateSessionFactoryon.close();

    }


    public void delete(int id) {
        // DELETE
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().begin();
        product = sesshibernateSessionFactoryon.getEntityManager().find(Product.class, id);
        sesshibernateSessionFactoryon.getEntityManager().remove(product);
        sesshibernateSessionFactoryon.getEntityManager().getTransaction().commit();
        sesshibernateSessionFactoryon.close();

    }

    public List<Product> findAll() {
         List<Product> product = sesshibernateSessionFactoryon
                 .getEntityManager()
                 .createQuery("\"select u from Product u", Product.class).getResultList();

        sesshibernateSessionFactoryon.close();
        return product;

    }


}
