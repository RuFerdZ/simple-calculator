package com.backend.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LoggingSystemFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calc")
public class CalculatorController {

    Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        logger.info("Adding {} and {}", a, b);
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        logger.info("Subtracting {} and {}", a, b);
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        logger.info("Multiplying {} and {}", a, b);
        return a * b;
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        logger.info("Dividing {} and {}", a, b);
        return a / b;
    }

    @GetMapping("/remainder")
    public int remainder(@RequestParam int a, @RequestParam int b) {
        logger.info("Finding remainder {} and {}", a, b);
        return a % b;
    }

    @GetMapping("/concat")
    public String concat(@RequestParam String a, @RequestParam String b) {
        logger.info("Concatenating {} and {}", a, b);
        return a + b;
    }

    @GetMapping("/power")
    public long power(@RequestParam double a, @RequestParam double b) {
        logger.info("Finding power of {} and {}", a, b);
        return (long) Math.pow(a, b);
    }
}
