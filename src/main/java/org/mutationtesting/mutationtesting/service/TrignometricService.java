package org.mutationtesting.mutationtesting.service;
import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.springframework.stereotype.Service;

@Service
public class TrignometricService {
    public double sine(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        double angleInRadians = Math.toRadians(x);
        return Math.sin(angleInRadians);
    }
    public double cosine(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        double angleInRadians = Math.toRadians(x);
        return Math.cos(angleInRadians);
    }
    public double tangent(double x) throws InvalidNumberException
    {
        if(Double.isNaN(x) || x==Double.POSITIVE_INFINITY || x==Double.NEGATIVE_INFINITY)
        {
            throw  new InvalidNumberException("x is not a valid number");
        }
        double angleInRadians = Math.toRadians(x);

        return Math.tan(angleInRadians);
    }

}
