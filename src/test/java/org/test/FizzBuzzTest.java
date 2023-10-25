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
    void playFizzBuzzDivByThree() {
        FizzBuzz fizz = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = fizz.playFizzBuzz(6);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    void playFizzBuzzDivByFive() {
        FizzBuzz fizz = new FizzBuzz();
        String expectedResult = "Buzz";
        String actualResult = fizz.playFizzBuzz(10);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    void playFizzBuzzDivByThreeAndFive() {
        FizzBuzz fizz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String actualResult = fizz.playFizzBuzz(15);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    void playFizzBuzzNumber() {
        FizzBuzz fizz = new FizzBuzz();
        String expectedResult = "1";
        String actualResult = fizz.playFizzBuzz(1);
        assertEquals(actualResult,expectedResult);    }
}