package com.rojojun.coyukdaebe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CoyukdaeBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoyukdaeBeApplication.class, args);
    }

}
