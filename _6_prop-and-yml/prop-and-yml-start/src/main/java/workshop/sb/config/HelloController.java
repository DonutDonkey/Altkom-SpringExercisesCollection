package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {
    @Value("${custom.hello}")
    private String hello;
    @GetMapping("/hello")
    public String getHello() { return hello; }

    @Value("${custom.foo}")
    private String foo;
    @GetMapping("/foo")
    public String getFoo() { return foo; }

    @Value("${custom.bar}")
    private String bar;
    @GetMapping("/bar")
    public String getBar() { return bar; }

    /* -- Zawsze z properties bedzie bral
//    @Value("${custom.hello}")
//    private String helloYml;
//    @GetMapping("/helloYML")
//    public String getHelloYml() { return helloYml; }
     */
}


