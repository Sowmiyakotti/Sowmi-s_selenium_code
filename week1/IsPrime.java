package homeassignment.week1;
import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number < 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
