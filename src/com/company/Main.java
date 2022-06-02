package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("You are in aland full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you. The other\n" +
                "dragon is greedy and hungry and will eat you on sight. Which cave will you go into?\n");
        System.out.println("(1 or 2)?");
        int num = 0;
        try
        {
            num = myScanner.nextInt();
        } catch (Exception err)
        {
            System.out.println(err.getClass().getName());
        }
        if (num == 1)
        {
            System.out.print("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                    "Gobbles you down in one bite!");
        } else if (num == 2)
        {
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                    "Hands you all of the treasure.");
        } else
        {
            System.out.println("You didn't enter a valid number.");
        }
        myScanner.close();
    }
}
