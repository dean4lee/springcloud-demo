package demo.cloud.sleuthservice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
