package demo.cloud.ribbonhystrixconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dean.lee
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test")
    @HystrixCommand(fallbackMethod = "testFallback")
    public String test(){
        String str = restTemplate.getForObject("http://eureka-service/hello", String.class);
        return str;
    }

    public String testFallback(){
        return "服务器开小差了";
    }
}