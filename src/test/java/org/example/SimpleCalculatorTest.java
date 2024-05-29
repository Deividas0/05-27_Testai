package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        // Setup
        var calculator = new SimpleCalculator();

        //Execution
        int result = calculator.add(2,2);

        //Assert
        assertEquals(result, calculator.add(2,2));


    }

}