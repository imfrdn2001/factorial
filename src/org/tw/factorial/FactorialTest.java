package org.tw.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialOfNumberZero(){

        Assertions.assertEquals(1, Factorial.factorialFinder(0));
    }

    @Test
    public void factorialOfNegativeNumbers(){

        long number = 0;

        if (number < 0){

            Assertions.assertEquals(-1,Factorial.factorialFinder(number));

        }
    }

    @Test
    public void factorialOfNumberEight(){

        Assertions.assertEquals(40320,Factorial.factorialFinder(8));

    }

    @Test
    public void factorialOfEleven(){

        Assertions.assertEquals(39916800, Factorial.factorialFinder(11));

    }


}