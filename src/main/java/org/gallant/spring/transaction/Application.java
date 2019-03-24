package org.gallant.spring.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kongyong
 * @date 2019/3/19
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
        Thread.sleep(Integer.MAX_VALUE);
    }

}
