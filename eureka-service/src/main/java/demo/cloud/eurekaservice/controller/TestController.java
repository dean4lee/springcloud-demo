package demo.cloud.eurekaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dean.lee
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("hello")
    public String getString(){
        return "port:" + port;
    }
}
