package shaffel1;

import java.util.Scanner;

public class Gamer {
    {
        System.out.println(" Computer choosed a number from 0 to 100");
        System.out.println("Enter the guessing number");
    }
        int a = 0;
    int random_number1 = a + (int) (Math.random() * 100);
    Scanner scanner = new Scanner(System.in);
    int number1 = Integer.valueOf(scanner.nextLine());

    {
        while (number1 < 101){
        if (number1 < random_number1) {
            System.out.println("Your number is too small");
            System.out.println("Try agan");
            int number2 = Integer.valueOf(scanner.nextLine());
            number1 = number2;
        }
        if (number1 > random_number1) {
            System.out.println("Your number is too big");
            System.out.println("Try agan");
            int number2 = Integer.valueOf(scanner.nextLine());
            number1 = number2;
        }
        if (number1 == random_number1) {
            System.out.println(" You won");
            number1 = number1 + 101;
        }
    }
    }
}
