package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;

@RestController
public class MainController {

//    @Autowired
//    private ClientRepository clientRepository;
//
//    @Autowired
//    private ClientService service;
//
//    @GetMapping("/client/all")
//    public List<Client> getTest(){
//        return clientRepository.getAllClients();
//    }
//
//    @GetMapping("/client/change_score")
//    public void changeScore(@RequestParam Long clientId, @RequestParam Integer delta){
//        service.changeScore(clientId, delta);
//    }
//
//    @PostMapping("/client/add")
//    public void addClientPost(@RequestBody Client client){
//        clientRepository.addClient(client);
//    }


//    @Autowired
//    private ProductRepository productRepository;

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
//    @GetMapping("cart/delete_product")
//    public void deleteProductFromCart(@RequestParam Long productId) {
//        prService.deleteProductFromCart(productId);
//    }
}
