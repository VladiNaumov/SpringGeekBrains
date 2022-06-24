package com.naumdeveleper.spring;


import java.util.List;
import java.util.Optional;

public interface IProductsService {

    //вернуть список всех продуктов
    List<Product> getItems();

    // создать новый продукт (* пусть ид у продукта подставляется автоматом на бэке, макс текущий ид + 1)
    void add(Product product);

    // вернуть продукт с указанным id
    Optional<Product> findById(Long id);

    // удаляет все продукты
    void removeAll();

    // удаляет продукт с указанным id
    boolean removeId(Long id);

}
