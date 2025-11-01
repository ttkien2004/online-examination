package cnpmnc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")  // mapping root
    public String home() {
        return "Ứng dụng Spring Boot + MySQL đang chạy!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Xin chào từ Spring Boot!";
    }
    
    @GetMapping("/greet")
    public String greet() {
        return "Xin chào greet!";
    }
}