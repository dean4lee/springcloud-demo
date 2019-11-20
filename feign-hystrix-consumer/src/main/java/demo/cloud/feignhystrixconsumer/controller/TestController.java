package demo.cloud.feignhystrixconsumer.controller;

import demo.cloud.feignhystrixconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dean.lee
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.hello();
    }
}
