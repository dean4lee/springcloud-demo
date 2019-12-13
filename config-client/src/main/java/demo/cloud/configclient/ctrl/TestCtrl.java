package demo.cloud.configclient.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

    @Value("${user.username}")
    private String username;

    @GetMapping("getUsername")
    public String getUsername(){
        return username;
    }
}
