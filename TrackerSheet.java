package com.developer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TrackerSheet {
    //Function to take String array(subjects and students) of 1D input
    public static void arrayInput(String[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            System.out.printf("Enter the name of %d: ", i+1);
            arr[i] = sc.nextLine();
        }
    }

    //Function to print String array of 1D
    public static void printArray(String[] arr) {
        System.out.print("\t\t");
        for (String element: arr) {
            System.out.print(element+"\t\t");
        }
//        System.out.println();
    }

    //Function to take input of student marks
    public static void arrayInput2D(float[][] arr, String[] arr1, String[] arr2) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            System.out.println("______________________________________________________");
            for (int j=0; j<arr[i].length; j++) {
                System.out.print("Marks of student "+arr1[i]+" in subject "+arr2[j]+": ");
                arr[i][j] = sc.nextFloat();
            }
        }
    }

    //Function to print progress tracker sheet
    public static void print2DArray(float[][] arr, String[] arr1, String[] arr2) {
        System.out.println("---------------------------------------------------------------------------");
        printArray(arr2);//printing subjects array
        System.out.println("Total\tPercentage");
        System.out.println("---------------------------------------------------------------------------");
        float [] perOfStudents = new float[arr1.length];
        for (int i=0; i<arr.length; i++) {
            float total = 0;
            System.out.print(arr1[i]+"\t|");
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
                total = total+arr[i][j];
            }
            System.out.print(total+"\t");
            //limiting the decimal point to 2D and converting into float value
            DecimalFormat df = new DecimalFormat("#.##");
            float percentage = Float.parseFloat(df.format((total/(arr2.length*100))*100));
            perOfStudents[i] = percentage;//storing percentages of students in array perOfStudents
            System.out.print(percentage+"%");
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------");
        topRated(perOfStudents, arr1);//calling topRated function
    }

    //Function to calculate and print top rated student
    public static void topRated(float [] percentages, String [] arr) {

        float max = percentages[0];
        int count = 0;
        for (int i=1; i<percentages.length; i++) {
            if (percentages[i]>max) {
                max = percentages[i];
                count++;
            }
        }
        System.out.println("Top Performer: "+arr[count]+" with "+ max+" %");
        System.out.println("--------------------------------------------------------");

    }
    public static void main(String[] args) throws IOException {
        System.out.println("---------------------------------------");
        System.out.println("-------Students Progress Tracker-------");
        System.out.println("---------------------------------------");
//        Scanner scan = new Scanner(System.in);

        //taking input using buffer reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        System.out.print("Enter the total number of subjects: ");
        int subCount = Integer.parseInt(br.readLine());//length of subjects array
        String [] subjects = new String[subCount];//subjects array
        arrayInput(subjects);//taking input of subjects using function arrayInput()

        System.out.println("-----------------------------------------");
        System.out.print("Enter the total number of students: ");
        int studentCount = Integer.parseInt(br.readLine());//length of students array
        String [] students = new String[studentCount];//students array
        arrayInput(students);//taking input of students using function arrayInput()

        float [][] marks = new float[studentCount][subCount];//marks array
        arrayInput2D(marks, students, subjects);//taking input of marks using function arrayInput2D()
        print2DArray(marks, students, subjects);//printing progress tracker sheet of students using function print2DArray()

        System.out.println("-------Thanks For Using Students Progress Tracker-------");
    }
}
