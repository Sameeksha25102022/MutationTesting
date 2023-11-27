package org.mutationtesting.mutationtesting.controller;
import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.mutationtesting.mutationtesting.service.ConversionService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;
@RestController
@RequestMapping("/conversion")
public class ConversionController {

    private static final Logger logger = getLogger(ConversionController.class);

    @Autowired
    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/binToDec")
    public String binToDec(@RequestParam("x") int x) {
        int result = 0;
        String message = "";

    try {
    result = conversionService.binToDec(x);
    message = "Decimal Conversion  of x=" + x + " is " + result;
    logger.info(message);
    }
    catch (InvalidNumberException e)
    {
        message = e.getMessage();
        logger.error(message);
    }
    return message;
    }

    @GetMapping("/decToBin")
    public String decToBin(@RequestParam("x") int x) {
        int result = 0;
        String message = "";

try {
    result = conversionService.decToBin(x);
    message = "Binary Conversion  of x=" + x +  " is " + result;
    logger.info(message);
}
catch (InvalidNumberException e)
{
    message = e.getMessage();
    logger.error(message);
}



        return message;
    }

    @GetMapping("/decToHex")
    public String decToHex(@RequestParam("x") int x) {
        String result = "";
        String message = "";

        try {
            result = conversionService.decToHex(x);
            message = "HexaDecimal Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (InvalidNumberException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }

    @GetMapping("/decToHex")
    public String decToOct(@RequestParam("x") int x) {
        String result = "";
        String message = "";

        try {
            result = conversionService.decToOct(x);
            message = "Octal Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (InvalidNumberException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }

    @GetMapping("/octToDec")
    public String octToDec(@RequestParam("x") String x) {
        int result = 0;
        String message = "";

        try {
            result = conversionService.octToDec(x);
            message = "Octal Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (IllegalArgumentException e)
        {
            message = e.getMessage();
            logger.error(message);
        }
        catch (InvalidNumberException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }
    @GetMapping("/hexToDec")
    public String hexToDec(@RequestParam("x") String x) {
        int result = 0;
        String message = "";

        try {
            result = conversionService.hexToDec(x);
            message = "HexaDecimal Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (InvalidNumberException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }

    @GetMapping("/decToBase")
    public String decToBase(@RequestParam("x") int x,@RequestParam("y") int y) {
        String result = "";
        String message = "";

        try {
            result = conversionService.decToBase(x,y);
            message = "Base Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (IllegalArgumentException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }

    @GetMapping("/baseToDec")
    public String baseToDec(@RequestParam("x") String x,@RequestParam("y") int y) {
        int result = 0;
        String message = "";

        try {
            result = conversionService.baseToDec(x,y);
            message = "Base Conversion  of x=" + x +  " is " + result;
            logger.info(message);
        }
        catch (IllegalArgumentException e)
        {
            message = e.getMessage();
            logger.error(message);
        }



        return message;
    }
}
