package com.mycompany.app.puzzlers;

public class Fizzbuzz {

    /**
     * write a program which return "fizz" if the number is a multiplier of 3, return "buzz" if its multiplier of 5 and return
     * "fizzbuzz" if the number is divisible by both 3 and 5. If the number is not divisible by either 3 or 5 then it should just
     * return the number itself.
     */
    public static void main(String[] args) {

        System.out.println("I passed 3 : " + fizzBuzz(3));
        System.out.println("I passed 4 : " + fizzBuzz(4));
        System.out.println("I passed 5 : " + fizzBuzz(5));
        System.out.println("I passed 6 : " + fizzBuzz(6));
        System.out.println("I passed 7 : " + fizzBuzz(7));
        System.out.println("I passed 15 : " + fizzBuzz(15));

    }

    public static String fizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }

        return number + "";
    }

    public static String fizzBuzz2(int number) {

        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            }
            else {
                return "fizz";
            }
        }
        else if (number % 5 == 0) {
            return "buzz";
        }

        return number + "";
    }
}
