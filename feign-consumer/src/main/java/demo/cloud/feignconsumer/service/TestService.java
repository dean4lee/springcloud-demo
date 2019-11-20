package demo.cloud.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dean.lee
 */
@FeignClient("eureka-service")
public interface TestService {

    @GetMapping("/hello")
    String hello();
}
