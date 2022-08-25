package com.geekbraims.hibernate.hw.version2.repository;

import com.geekbraims.hibernate.hw.version2.model.Product;
import com.geekbraims.hibernate.hw.version2.connect.ManagerFactoryUtil;

import java.util.List;

public class ProductDao {

/*
Задание
1. Создайте сущность Product (Long id, String title, int price) и таблицу в базе данных для хранения объектов этой сущности;
2. Создайте класс ProductDao и реализуйте в нем логику выполнения CRUD-операций над сущностью Product (Product findById(Long id), List<Product> findAll(), void deleteById(Long id), Product saveOrUpdate(Product product));
3. * Вшить ProductDao в веб-проект, и показывать товары, лежащие в базе данных. Помните что в таком случае SessionFactory или обертку над ней надо будет делать в виде Spring бина.
Дополнительные материалы
 */

    private final ManagerFactoryUtil entityManager;
    private Product product;


    public ProductDao() {
        entityManager = new ManagerFactoryUtil();
        entityManager.init();
        product = new Product();
    }

    public Product findById(int id) {
        product = entityManager.getEntityManager().find(Product.class, id);
        return product;

    }


    public void save(Product product) {
        /* INSERT */
        entityManager.getEntityManager().getTransaction().begin();
        entityManager.getEntityManager().persist(product);
        entityManager.getEntityManager().getTransaction().commit();
    }

    public void update(int id, String name) {
        // UPDATE
        entityManager.getEntityManager().getTransaction().begin();
        product = entityManager.getEntityManager().find(Product.class, id);
        product.setName(name);
        entityManager.getEntityManager().getTransaction().commit();

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
        entityManager.getEntityManager().getTransaction().begin();
        product = entityManager.getEntityManager().find(Product.class, id);
        entityManager.getEntityManager().remove(product);
        entityManager.getEntityManager().getTransaction().commit();
    }

    public List<Product> findAll() {
         List<Product> product = entityManager
                 .getEntityManager()
                 .createQuery("\"select u from Product u", Product.class).getResultList();

        return product;

    }

}
