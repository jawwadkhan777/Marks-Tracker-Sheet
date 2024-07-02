package com.developer;

public class Patterns {
    public static void main(String[] args) {
        //Advance Patterns

        //(1) Butterfly Pattern:
        System.out.println("-------Butterfly Pattern-------");
        int n = 4;
        //Upper part
        for (int i=1; i<=n; i++) {
            //stating star loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces loop
            for (int s=1; s<=2*(n-i); s++) {
                System.out.print(" ");
            }
            //ending star loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower part
        for (int i=n; i>=1; i--) {
            //stating star loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces loop
            for (int s=1; s<=2*(n-i); s++) {
                System.out.print(" ");
            }
            //ending star loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //switching to next line
            System.out.println();
        }


        //(2) Solid Rhombus Pattern:
        System.out.println("-------Solid Rhombus Pattern-------");
        int m = 5;
        //Outer loop
        for(int i=1;i<=m; i++) {
            //starting spaces loop
            for(int s=1; s<=m-i; s++) {
                System.out.print(" ");
            }
            //stars loop
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }
            //switching to next line
            System.out.println();
        }


        //(3) Number Pyramid Pattern:
        System.out.println("-------Number Pyramid Pattern-------");
        int o = 5;
        //outer loop
        for (int i=1; i<=o; i++) {
            //starting spaces loop
            for (int s=1; s<=o-i; s++) {
                System.out.print(" ");
            }
            //number loop
            for (int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            //switching to next line
            System.out.println();
        }


        //(4) Palindromic Pattern:
        System.out.println("-------Palindromic Pattern-------");
        int p = 5;
        //outer loop
        for (int i=1; i<=o; i++) {
            //starting spaces loop
            for (int s = 1; s <= p - i; s++) {
                System.out.print(" ");
            }
            //descending number loop ending at 1
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //ascending number loop starting from 2
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            //switching to next line
            System.out.println();
        }


        //(5) Diamond Pattern:
        System.out.println("-------Diamond Pattern-------");
        int d = 4;
        //First half outer loop
        for (int i=1; i<=d; i++) {
            //starting spaces loop
            for (int s=1; s<=d-i; s++)  {
                System.out.print(" ");
            }
            //stars loop
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            //switching to next line
            System.out.println();
        }
        //Second half outer loop
        for (int i=d-1; i>=1; i--) {
            //starting spaces loop
            for (int s=1; s<=d-i; s++)  {
                System.out.print(" ");
            }
            //stars loop
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            //switching to next line
            System.out.println();
        }

        System.out.println("-------THE END-------");
    }
}
