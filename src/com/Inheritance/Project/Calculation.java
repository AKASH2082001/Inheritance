package com.Inheritance.Project;

import java.util.Scanner;


    public class Calculation extends Operations
    {
        public int Multiply2Numbers(int a,int b)
        {
            return a*b;
        }

        public static void main(String[] args)
        {
            Calculation calc = new Calculation();
            Scanner input = new Scanner(System.in);

            int x, y, addResult, subResult, multiplyResult;
            System.out.println("Enter the first number:");
            x = input.nextInt();
            System.out.println("Enter the second number");
            y = input.nextInt();
            addResult = calc.Add_twonumbers(x, y);
            subResult = calc.Sub_twonumbers(x, y);
            multiplyResult = calc.Multiply2Numbers(x, y);
            System.out.println(addResult);
            System.out.println(subResult);
            System.out.println(multiplyResult);
        }
}
