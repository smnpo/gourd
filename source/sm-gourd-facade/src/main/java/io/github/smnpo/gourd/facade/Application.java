package io.github.smnpo.gourd.facade;

import io.github.smnpo.swagger.SwaggerAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author: Ming.Zhao
 * @create: 2019-05-07 19:40
 **/
@SpringBootApplication
@Import(SwaggerAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
