package ru.geekbrains.spring_less_web.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.spring_less_web.Model.SessionFactoryUtils;

@Configuration
@ComponentScan("ru.geekbrains.spring_less_web")  // ru.geekbrains.spring_less_web
public class AppConfig {

    @Bean
    public SessionFactoryUtils getSession() { // throws FileNotFoundException
        return new SessionFactoryUtils();
    }
}
