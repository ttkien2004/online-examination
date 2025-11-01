package cnpmnc.demo.controller;

import cnpmnc.demo.model.*;
import cnpmnc.demo.repository.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class DemoController {    

    @GetMapping("/ping")
    public String ping() {
        System.out.println("PING CALLED!");
        return "PONG: " + System.currentTimeMillis();
    }
    @GetMapping("/Hello")
    public String getMethodName(@RequestParam String param) {
        return new String("Hello " + param);
    }

    @GetMapping("/Welcome")
    public String getWelcomeName(@RequestParam String param) {
        return new String("Welcome " + param);
    }
    
    @GetMapping("/Bye")
    public String getByeName(@RequestParam String param) {
        return new String("Bye " + param);
    }
       
}
