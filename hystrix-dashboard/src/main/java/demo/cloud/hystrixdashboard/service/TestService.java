package demo.cloud.hystrixdashboard.service;

import demo.cloud.hystrixdashboard.service.impl.TestServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dean.lee
 */
@FeignClient(value = "eureka-service", fallback = TestServiceImpl.class)
public interface TestService {

    @GetMapping("/hello")
    String hello();
}
