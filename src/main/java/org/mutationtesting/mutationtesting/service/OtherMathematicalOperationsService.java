package org.mutationtesting.mutationtesting.service;
import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.springframework.stereotype.Service;
@Service
public class OtherMathematicalOperationsService {
    public double log(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY || x<0.0)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        return Math.log(x);
    }
    public double exponent(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        return Math.exp(x);
    }
    public double floor(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        return Math.floor(x);
    }
    public double ceil(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        return Math.ceil(x);
    }
    public double power (double base, int exponent) throws InvalidNumberException
    {
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent<0)
        {
            throw new InvalidNumberException("exponent is negative number");
        }
        if(Double.isNaN(base) || base==Double.POSITIVE_INFINITY || base==Double.NEGATIVE_INFINITY )
        {
            throw  new InvalidNumberException("base is not a valid number");
        }


        double result = 1.0;
        boolean isNegativeExponent = exponent < 0;
        exponent = Math.abs(exponent);

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return isNegativeExponent ? 1.0 / result : result;
    }
    public int isPrime(int num)
    {

        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;

    }
}
