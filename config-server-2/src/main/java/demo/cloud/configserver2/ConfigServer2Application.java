package demo.cloud.configserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer2Application.class, args);
    }
}
