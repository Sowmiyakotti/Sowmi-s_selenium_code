package homeassignment.week1;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int input = scanner.nextInt();

        int output = 0;
        
        for (int tempInput = input; tempInput != 0; tempInput /= 10) {
            int digit = tempInput % 10;
            output = output * 10 + digit;
        }

        if (input == output) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

}
