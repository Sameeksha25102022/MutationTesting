package org.mutationtesting.mutationtesting.service;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OperationService {
    OtherMathematicalOperationsService otherMathematicalOperationsService;

    public OperationService(OtherMathematicalOperationsService otherMathematicalOperationsService) {
        this.otherMathematicalOperationsService = otherMathematicalOperationsService;
    }

    public int addition(int x, int y) throws InvalidNumberException {
        if(x < 0) {
            throw new InvalidNumberException("x is negative value");
        }

        if(y < 0) {
            throw new InvalidNumberException("y is negative value");
        }

        return x + y;
    }

    public int subtraction(int x, int y) throws InvalidNumberException {
        if(x < 0) {
            throw new InvalidNumberException("x is negative value");
        }

        if(y < 0) {
            throw new InvalidNumberException("y is negative value");
        }

        return x - y;
    }

    public int multiplication(int x, int y) throws InvalidNumberException {


        return x * y;
    }
    public int division(int x, int y) throws InvalidNumberException {


        if(y == 0) {
            throw new InvalidNumberException("y is zero");
        }

        return x / y;
    }
    public int primeCount(int n) throws InvalidNumberException
    {
        if(n < 0) {
            throw new InvalidNumberException("n is negative value");}
        int count=0;
      for(int i=2; i<=n; i++)
      {
         int result= otherMathematicalOperationsService.isPrime(i);
         if(result==1)
             count++;
      }
      return count;
    }
    public ArrayList<Double> logsValues(ArrayList<Integer> v) throws InvalidNumberException
    {
        ArrayList<Double> res=new ArrayList<Double>();
        for(int i=0; i<v.size(); i++)
        {
            int n=v.get(i);
            if(n<0)
            {
                throw new InvalidNumberException("n is negative value");
            }
            double result=otherMathematicalOperationsService.log(n);
            res.add(result);
        }
        return res;
    }

}
