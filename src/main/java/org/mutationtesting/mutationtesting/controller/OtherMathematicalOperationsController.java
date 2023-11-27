package org.mutationtesting.mutationtesting.controller;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.mutationtesting.mutationtesting.service.OtherMathematicalOperationsService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;
@RestController
@RequestMapping("/mathoperation")
public class OtherMathematicalOperationsController {

    private static final Logger logger = getLogger(OtherMathematicalOperationsController.class);

    @Autowired
    private final OtherMathematicalOperationsService otherMathematicalOperationsService;

    public OtherMathematicalOperationsController(OtherMathematicalOperationsService otherMathematicalOperationsService) {
        this.otherMathematicalOperationsService = otherMathematicalOperationsService;
    }

    @GetMapping("/log")
    public String log(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = otherMathematicalOperationsService.log(x);
            message = "Logarithm of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/exp")
    public String exponent(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = otherMathematicalOperationsService.exponent(x);
            message = "Exponent of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }
    @GetMapping("/floor")
    public String floor(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = otherMathematicalOperationsService.floor(x);
            message = "Exponent of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/ceil")
    public String ceil(@RequestParam("x") double x) {
        double result = 0;
        String message = "";

        try {
            result = otherMathematicalOperationsService.ceil(x);
            message = "Exponent of x=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }
}
