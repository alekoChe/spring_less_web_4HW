package ru.geekbrains.spring_less_web.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.spring_less_web.Model.Product;

@Component()
@Scope("session")
public class Cart {

    private List<Product> cartLList;

    @PostConstruct
    public void init() {
        cartLList = new ArrayList<>();
    }

    public void addCartList(Product product) {
        cartLList.add(product);
    }

    public List<Product> showCartList() {
        return cartLList;
    }

    public void deleteProductFromCartList(Long id) {
        cartLList.removeIf(x -> x.getId().equals(id));
    }
}
