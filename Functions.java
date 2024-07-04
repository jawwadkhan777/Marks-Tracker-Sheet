package com.developer;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Functions {
    //Function to return the average of 'n' numbers
    public static String numAvg(int n, double... numbers) {
        double sum = 0;
        for (double num: numbers) {
            sum = sum+num;
        }
        //rounding off decimal into two places
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(sum/n);
//        BigDecimal bd = new BigDecimal(sum/n);
//        return bd.setScale(2, RoundingMode.HALF_UP);
    }

    //Function to print the factorial of a number
    public static void numFactorial(int num) {
        if (num<0) {
            System.out.println("Invalid Number!!!");
            return;
        }
        int product = 1;
        if (num==0) {
            System.out.println("Factorial of the given number: "+product);
            return;
        }
        for (int i=1; i<=num; i++) {
            product = product*i;
        }
        System.out.println("Factorial of the given number: "+product);
    }

    //Function to print the fibonacci series of the 'n' terms
    public static void fibSeries(int term) {
        if (term<=0) {
            System.out.println("Invalid Number!!!");
            return;
        }
        int preNumber = 0; //stores previous value
        int currentNumber = 1; //stores current value
        int sum = 1; //store next value
        int i=1;
        do {
            if (i==1) {
                System.out.print(0+ " ");
                i = i+1;
            }
            System.out.print(sum+" ");
            sum = preNumber+currentNumber;
            preNumber = currentNumber;
            currentNumber = sum;
            i = i+1;
        } while (i<=term);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//-----------------------------------------------------------------------------------------
        System.out.println("-----Average Calculation of 'n' numbers-----");
        System.out.print("Enter the count of numbers for average: ");
        int n = sc.nextInt();//taking input of the numbers' count for average
        double[] numbers = new double[n];//creating numbers array of length n
        for (int i=0; i<n; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = sc.nextDouble();//taking input of 'n' numbers
        }
        System.out.println("Average of given numbers is: "+ numAvg(n, numbers));
//-----------------------------------------------------------------------------------------
        System.out.println("-----Factorial Calculation of a number-----");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        numFactorial(num);
//-----------------------------------------------------------------------------------------
        System.out.println("-----Fibonacci Series-----");
        System.out.print("Enter the length of fibonacci series: ");
        int term = sc.nextInt();
        fibSeries(term);

        System.out.println("-------THE END-------");
    }
}
