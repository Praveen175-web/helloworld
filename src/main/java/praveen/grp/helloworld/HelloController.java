package praveen.grp.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot + Docker is Running!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from DevOps Project 🚀";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is UP ✅";
    }
}