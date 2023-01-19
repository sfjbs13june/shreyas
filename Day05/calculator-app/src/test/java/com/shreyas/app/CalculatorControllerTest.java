package com.shreyas.app;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorControllerTest {
    
    @Test
    public void addTest(){
        CalculatorController calculatorController = new CalculatorController();
        long result = calculatorController.add(10,12);
        Assertions.assertEquals(result,22);
    }

    @Test
    public void subTest(){
        CalculatorController calculatorController = new CalculatorController();
        long result = calculatorController.sub(10,12);
        Assertions.assertEquals(result,-2);
    }

    @Test
    public void mulTest(){
        CalculatorController calculatorController = new CalculatorController();
        long result = calculatorController.mul(12,13);
        Assertions.assertEquals(result, 156);
    }

    @Test
    public void divTest(){
        CalculatorController calculatorController = new CalculatorController();
        long result = calculatorController.div(50,10);
        Assertions.assertEquals(result, 5);
    }
}
