package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    @GetMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable Double n1, @PathVariable Double n2) { return n1 + n2; }

    @GetMapping("/sub/{n1}/{n2}")
    public Double sub(@PathVariable Double n1, @PathVariable Double n2) { return n1 - n2; }

    @GetMapping("/multiply/{n1}/{n2}")
    public Double multiply(@PathVariable Double n1, @PathVariable Double n2) { return n1 * n2; }

    @GetMapping("/divide/{n1}/{n2}")
    public Double divide(@PathVariable Double n1, @PathVariable Double n2) { return n1 / n2; }
}
