package org.mutationtesting.mutationtesting.service;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mutationtesting.mutationtesting.service.OperationService;
import org.mutationtesting.mutationtesting.service.OtherMathematicalOperationsService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MutationIntegrationTest {


    @InjectMocks
    private OtherMathematicalOperationsService otherMathematicalOperationsService = new OtherMathematicalOperationsService();

    @InjectMocks
    private OperationService operationService =new OperationService(otherMathematicalOperationsService);



    @Test
    void testIntegrationForPrimeCount() throws InvalidNumberException
    {
        assertEquals(4, operationService.primeCount(10));
        assertEquals(2,operationService.primeCount(3));
        assertEquals(5,operationService.primeCount(11));
        assertEquals(0,operationService.primeCount(0));
        assertNotEquals(2,operationService.primeCount(20));
        assertNotEquals(10,operationService.primeCount(2));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->operationService.primeCount(-5));
        assertEquals("n is negative value",exception.getMessage());
    }
    @Test
    void testIntegrationForLogs() throws InvalidNumberException
    {
        ArrayList<Integer> inputValues = new ArrayList<>();
        inputValues.add(100);
        inputValues.add(1000);
        ArrayList<Double> outputValues = new ArrayList<>();
        outputValues.add(4.605170185988092);
        outputValues.add(6.907755278982137);
        assertEquals(outputValues, operationService.logsValues(inputValues));
        ArrayList<Integer> inputValues1 = new ArrayList<>();
        inputValues1.add(90);
        inputValues1.add(77);
        ArrayList<Double> outputValues1 = new ArrayList<>();
        outputValues1.add(4.499809670330265);
        outputValues1.add(4.343805421853684);
     assertEquals(outputValues1,operationService.logsValues(inputValues1));
//
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->operationService.primeCount(-5));
        assertEquals("n is negative value",exception.getMessage());
    }


}
