package demo.cloud.sleuthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SleuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServiceApplication.class, args);
    }
}
