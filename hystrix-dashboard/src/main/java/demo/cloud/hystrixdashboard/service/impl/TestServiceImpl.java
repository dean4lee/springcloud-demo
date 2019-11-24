package demo.cloud.hystrixdashboard.service.impl;

import demo.cloud.hystrixdashboard.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {

    @Override
    public String hello() {
        return "服务器开小差了";
    }
}
