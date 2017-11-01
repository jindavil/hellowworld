package shaffel1;

import java.util.Scanner;

public class PC {
    {
        System.out.println("Now you need too choose max number size");
        System.out.println(" Enter max number size");
        Scanner scanner = new Scanner(System.in);
        int PCGmax = Integer.valueOf(scanner.nextLine());
        boolean win = true;
        boolean won = false;
        int PCguessnum = 0;
        int roundsofguess = 0;
        int randomnumber = 0;
        int PCGSmall = 0;
        boolean pokanepredumal = true;
        PCguessnum = PCGmax / 2;
        while (win != won) {
            System.out.println("Is this is your number " + PCguessnum);
            System.out.println("If tis is it write won");
            System.out.println("If it is too small write - s, if it too big write - b");
            String bigorsmall = scanner.nextLine();
            String big = ("b");
            String small = ("s");
            String winner = ("won");
            if ((bigorsmall).equals(big)) {
                boolean bigtrue = false;
                while (pokanepredumal != bigtrue) {
                    randomnumber = (int) (Math.random() * 100);
                    if ((randomnumber < PCguessnum) && (randomnumber > PCGSmall)) {
                        bigtrue = true;
                    }
                    PCGmax=PCguessnum;
                    PCguessnum=randomnumber;
                }
            }
            if ((bigorsmall).equals(small)) {
                boolean smalltrue = false;
                while (pokanepredumal != smalltrue) {
                    randomnumber = (int) (Math.random() * 100);
                    if ((randomnumber > PCguessnum) && (randomnumber<PCGmax)) {
                        smalltrue = true;
                    }
                    PCGSmall= PCguessnum;
                    PCguessnum= randomnumber;
                }
            }

            if ((bigorsmall).equals(won)) {
                won = true;
            }
            PCguessnum = randomnumber;
            roundsofguess = roundsofguess + 1;
        }
        System.out.println("your number is " + PCguessnum);
        System.out.println("PC needed " + roundsofguess + " Turns");
    }
}


