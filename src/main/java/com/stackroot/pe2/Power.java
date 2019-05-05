//Write a Java method to check if a given number is power of 4
package com.stackroot.pe2;

public class Power {
    //method to check even or odd
    public boolean check(int number) {
        while (number != 1) {
            if (number % 4 == 0)
            {

                number = number / 4;
            } else {

                return false;

            }
        }
        return true;
    }

    //method to check for negative input
    public boolean negativeInput(int number)
    {
        return number >= 0;
    }

    //method to check for zero input
    public boolean zeroInput(int number)
    {
        return number != 0;
    }
}