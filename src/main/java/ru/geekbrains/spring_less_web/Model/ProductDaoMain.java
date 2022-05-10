package ru.geekbrains.spring_less_web.Model;

import ru.geekbrains.spring_less_web.Service.ProductDaoImpl;

public class ProductDaoMain {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
            try {
                //UserDao userDao = new UserDaoImpl(sessionFactoryUtils);
                ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
                //userDao.testCache();
                //productDao.testCache();
                System.out.println(productDao.findByName("Bread")); ////
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                sessionFactoryUtils.shotdown();
            }

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        //ProductService productService = context.getBean(ProductService.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        System.out.println(productDao.findByName("Bread"));
    }
}
