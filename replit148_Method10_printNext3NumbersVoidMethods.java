package replitDesk;

import java.util.Scanner;

public class replit148_Method10_printNext3NumbersVoidMethods {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

     next3(num);
    }

/*
Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

 */

public static void next3(int n){
    System.out.println((n+1)+" "+(n+2)+" "+(n+3));
}



















}
