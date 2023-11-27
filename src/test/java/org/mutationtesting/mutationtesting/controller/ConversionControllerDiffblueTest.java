package org.mutationtesting.mutationtesting.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mutationtesting.mutationtesting.controller.ConversionController;
import org.mutationtesting.mutationtesting.exception.InvalidNumberException;
import org.mutationtesting.mutationtesting.service.ConversionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ConversionControllerDiffblueTest {
    /**
     * Method under test: {@link ConversionController#binToDec(int)}
     */
    @Test
    void testBinToDec() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Decimal Conversion  of x=2 is 2", (new ConversionController(new ConversionService())).binToDec(2));
        assertEquals("x is negative value", (new ConversionController(new ConversionService())).binToDec(-1));
    }

    /**
     * Method under test: {@link ConversionController#binToDec(int)}
     */
    @Test
    void testBinToDec2() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.binToDec(anyInt())).thenReturn(1);
        String actualBinToDecResult = (new ConversionController(conversionService)).binToDec(2);
        verify(conversionService).binToDec(anyInt());
        assertEquals("Decimal Conversion  of x=2 is 1", actualBinToDecResult);
    }

    /**
     * Method under test: {@link ConversionController#decToBin(int)}
     */
    @Test
    void testDecToBin() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Binary Conversion  of x=2 is 10", (new ConversionController(new ConversionService())).decToBin(2));
        assertEquals("x is negative value", (new ConversionController(new ConversionService())).decToBin(-1));
    }

    /**
     * Method under test: {@link ConversionController#decToBin(int)}
     */
    @Test
    void testDecToBin2() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.decToBin(anyInt())).thenReturn(1);
        String actualDecToBinResult = (new ConversionController(conversionService)).decToBin(2);
        verify(conversionService).decToBin(anyInt());
        assertEquals("Binary Conversion  of x=2 is 1", actualDecToBinResult);
    }

    /**
     * Method under test: {@link ConversionController#decToHex(int)}
     */
    @Test
    void testDecToHex() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("HexaDecimal Conversion  of x=2 is 2",
                (new ConversionController(new ConversionService())).decToHex(2));
        assertEquals("HexaDecimal Conversion  of x=0 is 0",
                (new ConversionController(new ConversionService())).decToHex(0));
        assertEquals("x is negative value", (new ConversionController(new ConversionService())).decToHex(-1));
    }

    /**
     * Method under test: {@link ConversionController#decToHex(int)}
     */
    @Test
    void testDecToHex2() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.decToHex(anyInt())).thenReturn("0123456789ABCDEF");
        String actualDecToHexResult = (new ConversionController(conversionService)).decToHex(2);
        verify(conversionService).decToHex(anyInt());
        assertEquals("HexaDecimal Conversion  of x=2 is 0123456789ABCDEF", actualDecToHexResult);
    }

    /**
     * Method under test: {@link ConversionController#decToOct(int)}
     */
    @Test
    void testDecToOct() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Octal Conversion  of x=2 is 2", (new ConversionController(new ConversionService())).decToOct(2));
        assertEquals("Octal Conversion  of x=0 is 0", (new ConversionController(new ConversionService())).decToOct(0));
        assertEquals("x is negative value", (new ConversionController(new ConversionService())).decToOct(-1));
    }

    /**
     * Method under test: {@link ConversionController#decToOct(int)}
     */
    @Test
    void testDecToOct2() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.decToOct(anyInt())).thenReturn("Dec To Oct");
        String actualDecToOctResult = (new ConversionController(conversionService)).decToOct(2);
        verify(conversionService).decToOct(anyInt());
        assertEquals("Octal Conversion  of x=2 is Dec To Oct", actualDecToOctResult);
    }

    /**
     * Method under test: {@link ConversionController#octToDec(String)}
     */
    @Test
    void testOctToDec() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Invalid octal value", (new ConversionController(new ConversionService())).octToDec("foo"));
    }

    /**
     * Method under test: {@link ConversionController#octToDec(String)}
     */
    @Test
    void testOctToDec2() throws InvalidNumberException, IllegalArgumentException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.octToDec(Mockito.<String>any())).thenReturn(1);
        String actualOctToDecResult = (new ConversionController(conversionService)).octToDec("foo");
        verify(conversionService).octToDec(Mockito.<String>any());
        assertEquals("Octal Conversion  of x=foo is 1", actualOctToDecResult);
    }

    /**
     * Method under test: {@link ConversionController#octToDec(String)}
     */
    @Test
    void testOctToDec3() throws InvalidNumberException, IllegalArgumentException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.octToDec(Mockito.<String>any())).thenThrow(new InvalidNumberException("Msg"));
        String actualOctToDecResult = (new ConversionController(conversionService)).octToDec("foo");
        verify(conversionService).octToDec(Mockito.<String>any());
        assertEquals("Msg", actualOctToDecResult);
    }

    /**
     * Method under test: {@link ConversionController#hexToDec(String)}
     */
    @Test
    void testHexToDec() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("HexaDecimal Conversion  of x=0123456789ABCDEF is -1985229329",
                (new ConversionController(new ConversionService())).hexToDec("0123456789ABCDEF"));
    }

    /**
     * Method under test: {@link ConversionController#hexToDec(String)}
     */
    @Test
    void testHexToDec2() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.hexToDec(Mockito.<String>any())).thenReturn(1);
        String actualHexToDecResult = (new ConversionController(conversionService)).hexToDec("0123456789ABCDEF");
        verify(conversionService).hexToDec(Mockito.<String>any());
        assertEquals("HexaDecimal Conversion  of x=0123456789ABCDEF is 1", actualHexToDecResult);
    }

    /**
     * Method under test: {@link ConversionController#hexToDec(String)}
     */
    @Test
    void testHexToDec3() throws InvalidNumberException {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.hexToDec(Mockito.<String>any())).thenThrow(new InvalidNumberException("Msg"));
        String actualHexToDecResult = (new ConversionController(conversionService)).hexToDec("0123456789ABCDEF");
        verify(conversionService).hexToDec(Mockito.<String>any());
        assertEquals("Msg", actualHexToDecResult);
    }

    /**
     * Method under test: {@link ConversionController#decToBase(int, int)}
     */
    @Test
    void testDecToBase() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Base Conversion  of x=2 is 2", (new ConversionController(new ConversionService())).decToBase(2, 3));
        assertEquals("Base must be between 2 and 16", (new ConversionController(new ConversionService())).decToBase(0, 1));
        assertEquals("Base must be between 2 and 16", (new ConversionController(new ConversionService())).decToBase(0, 17));
    }

    /**
     * Method under test: {@link ConversionController#decToBase(int, int)}
     */
    @Test
    void testDecToBase2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.decToBase(anyInt(), anyInt())).thenReturn("Dec To Base");
        String actualDecToBaseResult = (new ConversionController(conversionService)).decToBase(2, 3);
        verify(conversionService).decToBase(anyInt(), anyInt());
        assertEquals("Base Conversion  of x=2 is Dec To Base", actualDecToBaseResult);
    }

    /**
     * Method under test: {@link ConversionController#baseToDec(String, int)}
     */
    @Test
    void testBaseToDec() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        assertEquals("Invalid digit for the given base",
                (new ConversionController(new ConversionService())).baseToDec("foo", 3));
        assertEquals("Base must be between 2 and 16",
                (new ConversionController(new ConversionService())).baseToDec("foo", 1));
        assertEquals("Base must be between 2 and 16",
                (new ConversionController(new ConversionService())).baseToDec("foo", 17));
        assertEquals("Base Conversion  of x= is 0", (new ConversionController(new ConversionService())).baseToDec("", 2));
        assertEquals("Invalid digit for the given base",
                (new ConversionController(new ConversionService())).baseToDec("42", 3));
    }

    /**
     * Method under test: {@link ConversionController#baseToDec(String, int)}
     */
    @Test
    void testBaseToDec2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'com.example.testing.controller.ConversionController#2edaadef' method
        //   com.example.testing.controller.ConversionController#decToOct(int)
        //   to {GET [/conversion/decToHex]}: There is already 'com.example.testing.controller.ConversionController#2edaadef' bean method
        //   com.example.testing.controller.ConversionController#decToHex(int) mapped.
        //       at java.base/java.util.LinkedHashMap.forEach(LinkedHashMap.java:986)
        //   See https://diff.blue/R013 to resolve this issue.

        ConversionService conversionService = mock(ConversionService.class);
        when(conversionService.baseToDec(Mockito.<String>any(), anyInt())).thenReturn(1);
        String actualBaseToDecResult = (new ConversionController(conversionService)).baseToDec("foo", 3);
        verify(conversionService).baseToDec(Mockito.<String>any(), anyInt());
        assertEquals("Base Conversion  of x=foo is 1", actualBaseToDecResult);
    }
}
