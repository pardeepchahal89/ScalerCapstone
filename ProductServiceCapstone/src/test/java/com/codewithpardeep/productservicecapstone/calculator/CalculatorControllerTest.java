package com.codewithpardeep.productservicecapstone.calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class CalculatorControllerTest {
//    CalculatorService calculatorService = Mockito.mock(CalculatorService.class);
//    CalculatorController calculatorController = new CalculatorController(calculatorService);

    @MockitoBean
    CalculatorService calculatorService;

    @Autowired
    CalculatorController calculatorController;

    @Test
    public void testSumAcceptsTwoIntegersReturnsSumAsInteger()
    {
        when(calculatorService.add(5, 10)).thenReturn(15);
        when(calculatorService.add(6, 10)).thenReturn(16);

        //Arrange
        int a = 6;
        int b = 10;
        int expectedResult = 16;

        //Act
        int actualResult = calculatorController.sum(a, b);

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddAcceptsAnyTwoIntegersReturnsSumAsInteger() {
        when(calculatorService.add(5, 10)).thenReturn(15);
        when(calculatorService.add(anyInt(), anyInt())).thenReturn(100);

        // Arrange
        int a = 1000;
        int b = 2000;
        int expectedResult = 100;

        // Act
        int actualResult = calculatorController.sum(a, b);

        //Assert
        assertEquals(expectedResult, actualResult);
    }
}