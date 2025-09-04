package com.practice.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    void add_twoPositiveNumbers_returnCorrectSum() {

    double addition = calc.add(10.0, 5.0);
    assertEquals(15.0, addition, "The sum should be 15.0");


    }
    @Test
    void subtract_twoPositiveNumbers_returnCorrectSum(){

        double result = calc.sub(5.0, 10.0);

        assertEquals(-5.0, result, "The sum should be -5.0");

    }
    @Test
    void  multiply_twoPositiveNumbers_returnCorrectSum(){
        double result = calc.mul(5.0, 10.0);

        assertEquals(50.0, result, "The sum should be 50.0");
    }


}