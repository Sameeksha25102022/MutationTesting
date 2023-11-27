package org.mutationtesting.mutationtesting.service;

import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mutationtesting.mutationtesting.service.ConversionService;
import org.mutationtesting.mutationtesting.service.OperationService;
import org.mutationtesting.mutationtesting.service.OtherMathematicalOperationsService;
import org.mutationtesting.mutationtesting.service.TrignometricService;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OperationServiceTest {

    @InjectMocks
    private OperationService operationService;
    @InjectMocks
    private ConversionService conversionService;

    @InjectMocks
    private TrignometricService trignometricService;

    @InjectMocks
    private OtherMathematicalOperationsService otherMathematicalOperationsService;

    @Test
    void testDivisionForHappyPath() throws InvalidNumberException {
        int x = 16;
        int y = 2;
        int expectedResult = 8;
        int actualResult = operationService.division(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivisionForHappyPathNew() throws InvalidNumberException {
        int x = 2;
        int y = 2;
        int expectedResult = 1;
        int actualResult = operationService.division(x, y);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    void testDivisionForZeroY() {
        int x = 1;
        int y = 0;


        String expectedExceptionMessage = "y is zero";
        InvalidNumberException actualException = assertThrows(InvalidNumberException.class, () -> operationService.division(x, y));

        String actualExceptionMessage = actualException.getMessage();

        Assertions.assertTrue(expectedExceptionMessage.contentEquals(actualExceptionMessage));
    }

    @Test
    void testAdditionForHappyPath() throws InvalidNumberException {
        int x = 0;
        int y = 0;
        int expectedResult = 0;
        int actualResult = operationService.addition(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAdditionForHappyPathNew() throws InvalidNumberException {
        int x = 2;
        int y = 2;
        int expectedResult = 4;
        int actualResult = operationService.addition(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAdditionForNegativeX() {
        int x = -1;
        int y = 5;

        String expectedExceptionMessage = "x is negative value";
        InvalidNumberException actualException = assertThrows(InvalidNumberException.class, () -> operationService.addition(x, y));

        String actualExceptionMessage = actualException.getMessage();

        Assertions.assertTrue(expectedExceptionMessage.contentEquals(actualExceptionMessage));
    }

    @Test
    void testAdditionForNegativeY() {
        int x = 1;
        int y = -5;


        String expectedExceptionMessage = "y is negative value";
        InvalidNumberException actualException = assertThrows(InvalidNumberException.class, () -> operationService.addition(x, y));

        String actualExceptionMessage = actualException.getMessage();

        Assertions.assertTrue(expectedExceptionMessage.contentEquals(actualExceptionMessage));
    }

    @Test
    void testSubtractionForHappyPath() throws InvalidNumberException {
        int x = 0;
        int y = 0;
        int expectedResult = 0;
        int actualResult = operationService.subtraction(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSubtractionForHappyPathNew() throws InvalidNumberException {
        int x = 2;
        int y = 2;
        int expectedResult = 0;
        int actualResult = operationService.subtraction(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSubtractionForNegativeX() {
        int x = -1;
        int y = 5;

        String expectedExceptionMessage = "x is negative value";
        InvalidNumberException actualException = assertThrows(InvalidNumberException.class, () -> operationService.subtraction(x, y));

        String actualExceptionMessage = actualException.getMessage();

        Assertions.assertTrue(expectedExceptionMessage.contentEquals(actualExceptionMessage));
    }

    @Test
    void testSubtractionForNegativeY() {
        int x = 1;
        int y = -5;


        String expectedExceptionMessage = "y is negative value";
        InvalidNumberException actualException = assertThrows(InvalidNumberException.class, () -> operationService.subtraction(x, y));

        String actualExceptionMessage = actualException.getMessage();

        Assertions.assertTrue(expectedExceptionMessage.contentEquals(actualExceptionMessage));
    }

    @Test
    void testMultiplicationForHappyPath() throws InvalidNumberException {
        int x = 0;
        int y = 0;
        int expectedResult = 0;
        int actualResult = operationService.multiplication(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMultiplicationForHappyPathNew() throws InvalidNumberException {
        int x = 2;
        int y = 2;
        int expectedResult = 4;
        int actualResult = operationService.multiplication(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testConversionForBinToDec() throws InvalidNumberException {
        int x = 101;
        int expectedResult = 5;
        int actualResult = conversionService.binToDec(x);

        assertEquals(expectedResult, actualResult);
    }
@Test
void testConversionForDecToBin()  throws InvalidNumberException{

    assertEquals(101, conversionService.decToBin(5));
    assertEquals(1010, conversionService.decToBin(10));
    assertEquals(0, conversionService.decToBin(0));
    assertEquals(10, conversionService.decToBin(2));
    assertNotEquals(100, conversionService.decToBin(6));
    assertNotEquals(103, conversionService.decToBin(7));
    assertNotEquals(101, conversionService.decToBin(6));
}

    @Test
    void testConversionForDecToHex() throws InvalidNumberException{

        assertEquals("1A", conversionService.decToHex(26));
        assertEquals("0", conversionService.decToHex(0));
        assertEquals("1F4", conversionService.decToHex(500));
        assertNotEquals("12",conversionService.decToHex(333));
        assertNotEquals("E3",conversionService.decToHex(23));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.decToHex(-10));
        assertEquals("x is negative value", exception.getMessage());
    }

    @Test
    void testConversionForHexToDec() throws InvalidNumberException{

        assertEquals(26, conversionService.hexToDec("1A"));
        assertEquals(0, conversionService.hexToDec("0"));
        assertEquals(500, conversionService.hexToDec("1F4"));
        assertNotEquals(333,conversionService.hexToDec("12"));
        assertNotEquals(23,conversionService.hexToDec("E3"));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.decToHex(-10));
        assertEquals("x is negative value", exception.getMessage());
    }

  @Test
  void testConversionForDecToOct() throws InvalidNumberException{
        assertEquals("17",conversionService.decToOct(15));
      assertEquals("0", conversionService.decToOct(0));
      assertEquals("620", conversionService.decToOct(400));
      assertNotEquals("24",conversionService.decToOct(2));
      InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.decToOct(-10));
      assertEquals("x is negative value", exception.getMessage());
  }

    @Test
    void testConversionForOctToDec() throws InvalidNumberException{
        assertEquals(15,conversionService.octToDec("17"));
        assertEquals(0, conversionService.octToDec("0"));
        assertEquals(400, conversionService.octToDec("620"));
        assertNotEquals(24,conversionService.octToDec("2"));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.octToDec("-10"));
        assertEquals("x is negative value", exception.getMessage());
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> conversionService.octToDec("89"));
        assertEquals("Invalid octal value", exception1.getMessage());

    }

    @Test
    void testConversionForBaseToDec() throws InvalidNumberException{
        assertEquals(15,conversionService.baseToDec("17",8));
        assertEquals(0, conversionService.baseToDec("0",8));
        assertEquals(400, conversionService.baseToDec("620",8));
        assertNotEquals(24,conversionService.baseToDec("2",8));
        assertEquals(26, conversionService.baseToDec("1A",16));
        assertEquals(0, conversionService.baseToDec("0",16));
        assertEquals(500, conversionService.baseToDec("1F4",16));
        assertNotEquals(333,conversionService.baseToDec("12",16));
        assertNotEquals(23,conversionService.baseToDec("E3",16));
        assertEquals(9,conversionService.baseToDec("14",5));
        assertEquals(0, conversionService.baseToDec("0",5));
        assertEquals(110, conversionService.baseToDec("420",5));
        assertNotEquals(24,conversionService.baseToDec("2",5));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.octToDec("-10"));
        assertEquals("x is negative value", exception.getMessage());
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> conversionService.octToDec("89"));
        assertEquals("Invalid octal value", exception1.getMessage());

    }

    @Test
    void testConversionForDecToBase() throws InvalidNumberException{
        assertEquals("17",conversionService.decToBase(15,8));

        assertEquals("620", conversionService.decToBase(400,8));
        assertNotEquals("2",conversionService.decToBase(24,8));
        assertEquals("1A", conversionService.decToBase(26,16));
        //assertEquals("0", conversionService.decToBase(0,16));
        assertEquals("1F4", conversionService.decToBase(500,16));
        assertNotEquals("12",conversionService.decToBase(333,16));
        assertNotEquals("E3",conversionService.decToBase(23,16));
        assertEquals("14",conversionService.decToBase(9,5));
        //assertEquals("0", conversionService.decToBase(0,5));
        assertEquals("420", conversionService.decToBase(110,5));
        assertNotEquals("2",conversionService.decToBase(24,5));
//        InvalidNumberException exception = assertThrows(InvalidNumberException.class, () -> conversionService.octToDec("-10"));
//        assertEquals("x is negative value", exception.getMessage());
//        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> conversionService.octToDec("89"));
//        assertEquals("Invalid octal value", exception1.getMessage());

    }

    @Test
    void testConversionForSine() throws InvalidNumberException
    {
        assertEquals(0.49999999999999994, trignometricService.sine(30.0), 1e-10);
        assertEquals(-0.3420201433256687, trignometricService.sine(200.0), 1e-10);
        assertEquals(0.8660254037844386, trignometricService.sine(60.0), 1e-10);
        assertEquals(0.3061086320328143, trignometricService.sine(1.0E20), 1e-10);
        assertNotEquals(0.2234001983778,trignometricService.sine(400.0),1e-10);
        assertNotEquals(0.112334001983778,trignometricService.sine(23.0),1e-10);

        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->trignometricService.sine(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.sine(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.sine(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());

    }

    @Test
    void testConversionForCosine() throws InvalidNumberException
    {
        assertEquals(0.7071067811865475, trignometricService.cosine(45.0), 1e-10);
        assertEquals(0.5000000000000001, trignometricService.cosine(300.0), 1e-10);
        assertEquals(0.8660254037844387, trignometricService.cosine(30.0), 1e-10);
        assertNotEquals(0.2234001983778,trignometricService.cosine(400.0),1e-10);
        assertNotEquals(0.114534001983778,trignometricService.cosine(23.0),1e-10);
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->trignometricService.cosine(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.cosine(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.cosine(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
    }

    @Test
    void testConversionForTangent() throws InvalidNumberException
    {
        assertEquals(1.7320508075688772, trignometricService.tangent(60.0), 1e-10);
        assertEquals(1.7320508075688772, trignometricService.tangent(240.0), 1e-10);
        assertEquals(0.9999999999999999, trignometricService.tangent(45.0), 1e-10);
        assertEquals(-0.5773502691896265,trignometricService.tangent(330.0),1e-10);
        assertNotEquals(0.445399991111023,trignometricService.tangent(23),1e-10);
        assertNotEquals(-0.8873898928393292,trignometricService.tangent(-23),1e-10);

        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->trignometricService.tangent(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.tangent(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->trignometricService.tangent(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());

    }
    @Test
    void testConversionForLog() throws InvalidNumberException
    {
        assertEquals(2.302585092994046, otherMathematicalOperationsService.log(10.0), 1e-10);
        assertEquals(0.0, otherMathematicalOperationsService.log(1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, otherMathematicalOperationsService.log(0.0), 0.0);
        assertNotEquals(3.3332232587999832,otherMathematicalOperationsService.log(2.0));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.log(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.log(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.log(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.log(-5.0));
        assertEquals("x is not a valid number",exception.getMessage());
    }

    @Test
    void testConversionForExponent() throws InvalidNumberException
    {
        assertEquals(7.3890560989306495, otherMathematicalOperationsService.exponent(2.0), 1e-10);
        assertEquals(1.0, otherMathematicalOperationsService.exponent(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, otherMathematicalOperationsService.exponent(5.0E6), 0.0);
        assertEquals(0.0, otherMathematicalOperationsService.exponent(-5.0E6), 0.0);
        assertNotEquals(0.0,otherMathematicalOperationsService.exponent(3.0),1e-10);
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.exponent(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.exponent(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.exponent(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());

    }
    @Test
    void testConversionForFloor() throws InvalidNumberException
    {
        assertEquals(5.0, otherMathematicalOperationsService.floor(5.7), 0.0);
        assertEquals(-6.0, otherMathematicalOperationsService.floor(-5.7), 0.0);
        assertEquals(42.0, otherMathematicalOperationsService.floor(42.0), 0.0);
        assertEquals(1.5E10, otherMathematicalOperationsService.floor(1.5E10), 0.0);
        assertEquals(-1.5E10, otherMathematicalOperationsService.floor(-1.5E10), 0.0);
        assertNotEquals(-4.0,otherMathematicalOperationsService.floor(5.6));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.floor(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.floor(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.exponent(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());

    }
    @Test
    void testConversionForCeil() throws InvalidNumberException
    {
        assertEquals(6.0, otherMathematicalOperationsService.ceil(5.7), 0.0);
        assertEquals(-5.0, otherMathematicalOperationsService.ceil(-5.7), 0.0);
        assertEquals(42.0, otherMathematicalOperationsService.ceil(42.0), 0.0);
        assertEquals(1.5E10, otherMathematicalOperationsService.ceil(1.5E10), 0.0);
        assertEquals(-1.5E10, otherMathematicalOperationsService.ceil(-1.5E10), 0.0);
        assertNotEquals(-4.0,otherMathematicalOperationsService.ceil(5.6));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.ceil(Double.NaN));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.ceil(Double.NEGATIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.ceil(Double.POSITIVE_INFINITY));
        assertEquals("x is not a valid number",exception.getMessage());

    }

    @Test
    void testConversionForPower() throws InvalidNumberException
    {
        assertEquals(8.0, otherMathematicalOperationsService.power(2.0,3), 0.0);
        assertEquals(1.0, otherMathematicalOperationsService.power(5.0,0), 0.0);
        assertEquals(0.0, otherMathematicalOperationsService.power(0.0,3), 0.0);
        assertEquals(1.0, otherMathematicalOperationsService.power(0.0,0), 0.0);
        assertEquals(9.0, otherMathematicalOperationsService.power(-3.0,2), 1e-10);
        assertNotEquals(8.0,otherMathematicalOperationsService.power(3.0,2));
        assertNotEquals(8.0,otherMathematicalOperationsService.power(-3.0,2));
        InvalidNumberException exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.power(4.0,-3));
        assertEquals("exponent is negative number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.power(Double.NaN,2));
        assertEquals("base is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.power(Double.NEGATIVE_INFINITY,3));
        assertEquals("base is not a valid number",exception.getMessage());
        exception = assertThrows(InvalidNumberException.class,()->otherMathematicalOperationsService.power(Double.POSITIVE_INFINITY,4));
        assertEquals("base is not a valid number",exception.getMessage());
    }

}
