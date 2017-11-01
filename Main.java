package shaffel1;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, today we will play a game, you need to chose ");
        System.out.println("who  will try to guess number, if you- write y, if PC- write n ");
        Scanner scanner = new Scanner(System.in);
        String yesorno = scanner.nextLine();
        String yes = ("y");
        String no = ("n");
        if ((yesorno).equals(yes)) {
            Gamer play = new Gamer();

        } else if ((yesorno).equals(no)) {
            PC play2 = new PC();




        }
    }
}