package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import ru.gbAleko.spring_lesson_3HW.model.Product;
//import ru.gbAleko.spring_lesson_3HW.repository.ProductRepository;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

import java.util.List;

@Component()
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product getProductAccordingId(Long id){
        return productRepository.findById(id);
    }

    public List<Product> getProductList() {
        return productRepository.showProductList();
    }

    public void addProduct(Product product) {
        productRepository.addProductList(product);
    }

}
