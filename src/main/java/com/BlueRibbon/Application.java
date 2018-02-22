package com.BlueRibbon; /**
 * Created by omer on 2/13/2018.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
    public class Application {

        public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
