package workshop.sb.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String separator = " ";

    @Value("${greeting}")
    private String greeting;

    @GetMapping("/hello")
    public String greetName(@RequestParam(value = "name", required = false, defaultValue = "World!") String name) {
        return greeting + separator + name;
    }
}


