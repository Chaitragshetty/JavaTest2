//Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bitsigned integer).

package com.stackroot.pe2;
import java.util.Scanner;
//main method
public class Factorial {
    public static void main(String args[]) {
        Factorial.FactorialNumber();

    }
//method to calculate factorial
    public static void FactorialNumber() {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int number=s.nextInt();
        int fact = 1;
        for (int i = 0;i<number;i++)
        {
//checking whether its within range or not
            if(fact<-2147483648  || fact>2147483647)
            {
                System.out.println("out of range");
                break;
            }
            fact=1;
            for (int j = 1; j <=i; j++)
            {
                fact = fact * j;
            }


            System.out.println("the factorial is " +i+ "is" +fact);

        }

    }
}
