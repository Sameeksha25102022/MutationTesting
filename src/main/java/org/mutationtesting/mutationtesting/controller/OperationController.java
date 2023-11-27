package org.mutationtesting.mutationtesting.controller;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.mutationtesting.mutationtesting.service.OperationService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/operation")
public class OperationController {

    private static final Logger logger = getLogger(OperationController.class);

    @Autowired
    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("x") int x, @RequestParam("y") int y) {
        int result = 0;
        String message = "";

        try {
            result = operationService.addition(x, y);
            message = "Addition of x=" + x + " and y=" + y + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/sub")
    public String sub(@RequestParam("x") int x, @RequestParam("y") int y) {
        int result = 0;
        String message = "";

        try {
            result = operationService.subtraction(x, y);
            message = "Subtraction of x=" + x + " and y=" + y + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/mul")
    public String mul(@RequestParam("x") int x, @RequestParam("y") int y) {
        int result = 0;
        String message = "";

        try {
            result = operationService.multiplication(x, y);
            message = "Multiplication of x=" + x + " and y=" + y + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }
    @GetMapping("/div")
    public String div(@RequestParam("x") int x, @RequestParam("y") int y) {
        int result = 0;
        String message = "";

        try {
            result = operationService.division(x, y);
            message = "Division of x=" + x + " and y=" + y + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/primeCount")
    public String primeCount(@RequestParam("x") int x) {
        int result = 0;
        String message = "";

        try {
            result = operationService.primeCount(x);
            message = "Count=" + x + " is " + result;
            logger.info(message);
        } catch (InvalidNumberException e) {
            message = e.getMessage();
            logger.error(message);
        }

        return message;
    }

    @GetMapping("/logs")
    public String logs(@RequestParam("x") ArrayList<Integer> x) {
        ArrayList<Double> res = new ArrayList<Double>();

        String message = "";

            try {
                res = operationService.logsValues(x);
                for(int i=0; i<res.size(); i++) {
                    message = "Log of value at index " + i + "=" + x + " is " + res.get(i);
                    logger.info(message);
                }
            } catch (InvalidNumberException e) {
                message = e.getMessage();
                logger.error(message);
            }

            return message;

    }
}
