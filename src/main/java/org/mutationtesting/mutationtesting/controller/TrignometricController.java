package org.mutationtesting.mutationtesting.controller;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.mutationtesting.mutationtesting.service.TrignometricService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;
@RestController
@RequestMapping("/trigoperation")
public class TrignometricController {
    private static final Logger logger = getLogger(TrignometricController.class);

    @Autowired
    private final TrignometricService trignometricService;

    public TrignometricController(TrignometricService trignometricService) {
        this.trignometricService = trignometricService;
    }
    @GetMapping("/sin")
    public String sin(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = trignometricService.sine(x);
            message = "Sine of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/cosine")
    public String cosine(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = trignometricService.cosine(x);
            message = "Sine of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/ctan")
    public String tangent(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = trignometricService.tangent(x);
            message = "Sine of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }


}
