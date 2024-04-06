package homeassignment.week1;

import java.util.Scanner;

public class FibonacciInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range for Fibonacci series: ");
        int range = scanner.nextInt();
        

        System.out.println("Fibonacci series within range up to " + range + ":");
        int first = 0;
        int second = 1;
        int next = first + second;
        if (range >= 1)
            System.out.print(first + " ");
        if (range >= 2)
            System.out.print(second + " ");
        
        
        for (int i = 3; i <= range ; i++) {
        	
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;     
    }
        scanner.close();
}}
