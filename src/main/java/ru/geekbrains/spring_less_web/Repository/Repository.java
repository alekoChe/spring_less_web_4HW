package ru.geekbrains.spring_less_web.Repository;

import org.springframework.stereotype.Component;
//import ru.gbAleko.spring_lesson_3HW.model.Product;
import ru.geekbrains.spring_less_web.Model.Product;

@Component
public interface Repository {
    Product findById(Long id);
}
