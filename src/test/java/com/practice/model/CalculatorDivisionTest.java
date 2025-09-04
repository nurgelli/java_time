package com.practice.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorDivisionTest {

    Calculator calc = new Calculator();

    @Test
    void divide_twoPositiveNumbers_throwsError(){

        assertThrows(IllegalArgumentException.class, () -> calc.div(10.0, 0.0));

    }

}