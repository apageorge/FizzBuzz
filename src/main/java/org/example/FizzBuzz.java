package org.example;

public class FizzBuzz {
    public  String playFizzBuzz(int i) {
        String output;
        if (i % 5 == 0 && i % 3 == 0) {
            output = "FizzBuzz";
        } else if (i % 3 == 0) {
            output = "Fizz";
        } else if (i % 5 == 0) {
            output = "Buzz";
        } else {
            output = Integer.toString(i);
        }
        return output;

    }
}
