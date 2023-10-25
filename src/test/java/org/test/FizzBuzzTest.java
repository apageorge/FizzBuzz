package org.test;

import org.example.FizzBuzz;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void playFizzBuzzNumber() {
        FizzBuzz fizz = new FizzBuzz();
        assertEquals(fizz.playFizzBuzz(1),"1");
    }
    @Test
    void playFizzBuzzDivByThree() {
        FizzBuzz fizz = new FizzBuzz();
        assertEquals(fizz.playFizzBuzz(6),"Fizz");
    }
    @Test
    void playFizzBuzzDivByFive() {
        FizzBuzz fizz = new FizzBuzz();
        assertEquals(fizz.playFizzBuzz(10),"Buzz");
    }
    @Test
    void playFizzBuzzDivByThreeAndFive() {
        FizzBuzz fizz = new FizzBuzz();
        assertEquals(fizz.playFizzBuzz(15),"FizzBuzz");
    }
}