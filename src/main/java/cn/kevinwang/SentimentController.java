package cn.kevinwang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("cn.kevinwang.component")
public class SentimentController {
    public static void main(String[] args) {
        SpringApplication.run(SentimentController.class, args);
    }
}
