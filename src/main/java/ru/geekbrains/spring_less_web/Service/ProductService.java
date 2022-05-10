package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import ru.gbAleko.spring_lesson_3HW.model.Product;
//import ru.gbAleko.spring_lesson_3HW.repository.ProductRepository;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Model.SessionFactoryUtils;
import ru.geekbrains.spring_less_web.Repository.Cart;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

import java.util.List;

@Component()
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private Cart cart;
    @Autowired
    private SessionFactoryUtils sessionFactoryUtils;


    public Product getProductAccordingId(Long id){
        return productRepository.findById(id);
    }

    public List<Product> getProductList() {
        return productRepository.showProductList();
    }

    public void addProduct(Product product) {
        productRepository.addProductList(product);
    }

    public void addProductIntoCart(Long id) {cart.addCartList(productRepository.findById(id));}

    public List<Product> getCartList() {
        return cart.showCartList();
    }

    public void deleteProductFromCart(Long id) {
        cart.deleteProductFromCartList(id);
    }

}
