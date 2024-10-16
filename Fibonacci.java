// write a fibonacci series using recurtion.

import java.util.Scanner;

public class Fibonacci{
 public static int fibnacci(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else
        return fibnacci(n - 1) + fibnacci(n - 2);

}

public static void printFibonacciSequence(int n){
    for (int i=0; i<n; i++){
        System.out.print(" "+ fibnacci(i));
    }
    // System.out.println(" ");
}
 
    public static void main(String args[]) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num value you want to print the fibonacci series");
       int num= sc.nextInt();
         printFibonacciSequence(num);

    }
}