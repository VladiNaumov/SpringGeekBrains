package com.naumdeveleper.spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ProductsRepository {
    private List<Product> items;

    public ProductsRepository() {
        this.items = new ArrayList<>();
        items.add(new Product(1L, "Milk", 1.0));
        items.add(new Product(2L, "Bread", 1.80));
        items.add(new Product(3L, "Apple", 3.40));
        items.add(new Product(4L, "Plumb", 17.25));
    }

    public List<Product> getItems() {
        //вернуть список всех продуктов
        return Collections.unmodifiableList(items);
    }


    public void add(Product product) {
        TODO: // создать новый продукт (* пусть ид у продукта подставляется автоматом на бэке, макс текущий ид + 1)
        items.add(product);
    }

    public Optional <Product> findById(Long id) {
        // вернуть продукт с указанным id
        return items.stream().filter(p -> p.getId().equals(id)).findFirst();

    }
    
 
    public void removeAll(){
        // удаляет все продукты
        items.clear();
    }

    public void removeId(Long id){
        // удаляет продукт с указанным id
        items.removeIf(p -> p.getId().equals(id));

    }

}
