package org.mutationtesting.mutationtesting.service;
import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {
    public int binToDec(int binaryInteger) throws InvalidNumberException
    {
        if(binaryInteger<0)
        {
            throw new InvalidNumberException("x is negative value");
        }
        int decimal = 0;
        int base = 1;

        while (binaryInteger > 0) {
            int lastDigit = binaryInteger % 10;
            binaryInteger /= 10;
            decimal += lastDigit * base;
            base *= 2;
        }

        return decimal;
    }
    public int decToBin(int decimal) throws InvalidNumberException{
        if(decimal < 0) {
            throw new InvalidNumberException("x is negative value");
        }

        int binaryInteger = 0;
        int base = 1;

    while (decimal > 0) {
        int remainder = decimal % 2;
        decimal /= 2;
        binaryInteger += remainder * base;
        base *= 10;
    }
        return binaryInteger;
    }

    public String decToHex(int decimal) throws InvalidNumberException{
        if(decimal < 0) {
            throw new InvalidNumberException("x is negative value");
        }

        StringBuilder hexadecimal = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();

        if (decimal == 0)
            return "0";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal.insert(0, hexChars[remainder]);
            decimal /= 16;
        }

        return hexadecimal.toString();
    }

    public String decToOct(int decimal) throws InvalidNumberException{
        if(decimal < 0) {
            throw new InvalidNumberException("x is negative value");
        }

        StringBuilder octal = new StringBuilder();
        if(decimal==0)
        {
            return "0";
        }
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }

        return octal.toString();
    }

    public int octToDec(String octal) throws InvalidNumberException,IllegalArgumentException{


        int decimal = 0;
        int power = 0;
        if(octal.charAt(0)=='-')
            throw new InvalidNumberException("x is negative value");

        // Traverse the octal number from right to left
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digitChar = octal.charAt(i);
            int digit = Character.digit(digitChar, 8);

            if (digit == -1 || digit >= 8) {
                throw new IllegalArgumentException("Invalid octal value");
            }

            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;

    }



    public int hexToDec(String hexadecimal) throws InvalidNumberException{


        int decimal = 0;
        String hexChars = "0123456789ABCDEF";

        for (int i = 0; i < hexadecimal.length(); i++) {
            if(hexadecimal.charAt(0)=='-')
            {
                throw new InvalidNumberException("x is negative value");
            }
            char hexChar = hexadecimal.charAt(i);
            int digit = hexChars.indexOf(hexChar);
            decimal = decimal * 16 + digit;
        }

        return decimal;
    }

    public String decToBase(int decimal, int base) {
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be between 2 and 16");
        }

        StringBuilder result = new StringBuilder();
        char[] baseChars = "0123456789ABCDEF".toCharArray();

        while (decimal > 0) {
            int remainder = decimal % base;
            result.insert(0, baseChars[remainder]);
            decimal /= base;
        }

        return result.toString();
    }

    public int baseToDec(String number, int base) {
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be between 2 and 16");
        }

        int decimal = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char digitChar = number.charAt(i);
            int digit = Character.digit(digitChar, base);

            if (digit == -1 || digit >= base) {
                throw new IllegalArgumentException("Invalid digit for the given base");
            }

            decimal += digit * Math.pow(base, power);
            power++;
        }

        return decimal;
    }

}
