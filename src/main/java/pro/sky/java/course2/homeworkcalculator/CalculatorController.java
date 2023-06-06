package pro.sky.java.course2.homeworkcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") String firstValue, @RequestParam("num2") String secondValue) {
        return calculatorService.plus(firstValue, secondValue);
    }


    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") String firstValue, @RequestParam("num2") String secondValue) {
        return calculatorService.minus(firstValue, secondValue);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") String firstValue, @RequestParam("num2") String secondValue) {
        return calculatorService.multiply(firstValue, secondValue);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") String firstValue, @RequestParam("num2") String secondValue) {
        return calculatorService.divide(firstValue, secondValue);
    }
}