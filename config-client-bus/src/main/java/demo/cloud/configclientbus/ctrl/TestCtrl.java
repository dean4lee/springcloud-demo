package demo.cloud.configclientbus.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//在使用配置属性的类上添加，不添加无法刷新属性
@RefreshScope
public class TestCtrl {

    @Value("${user.username}")
    private String username;

    @GetMapping("getUsername")
    public String getUsername(){
        return username;
    }
}
