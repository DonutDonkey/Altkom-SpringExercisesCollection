package workshop.sb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyConfig myConfig;

    @GetMapping("/foo")
    public String foo() { return myConfig.getFoo(); }

    @GetMapping("/bar")
    public String bar() { return myConfig.getBar(); }

    @GetMapping("/x")
    public int x() { return myConfig.getX(); }
/*
          TODO 5  napisz test kontrollera

          Użyj @TestPropertySource na kalsie dla wskazania pliku properties
          Wstrzyknij w test Environment - pobierz z niego wartości propertisów dla porównania tych przychodzących z kontrolera
        */
}
