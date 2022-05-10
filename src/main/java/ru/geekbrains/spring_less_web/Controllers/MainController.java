package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductService prService;

    @GetMapping("/product/all")
    public List<Product> getProductList(){
        return prService.getProductList();
    }

    @PostMapping("/product/add")
    public void addProductPost(@RequestBody Product product){
        prService.addProduct(product);
    }

    @GetMapping("/cart/all")
    public List<Product> getCartList(){
        return prService.getCartList();
    }

    @GetMapping("/cart/add")         //@PostMapping
    public void addProductInCartPost(@RequestParam Long productId) {
        prService.addProductIntoCart(productId);
    }

    @GetMapping("/cart/delete_product/{id}")
    public void deleteProductFromCart(@RequestParam Long id) {
        prService.deleteProductFromCart(id);
    }
}
