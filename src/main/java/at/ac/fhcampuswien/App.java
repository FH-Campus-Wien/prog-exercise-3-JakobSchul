package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    // Implement all methods as public static


    public static void oneMonthCalendar(int numberDay, int startingDay) {
        int reihe = 0;
        int horizontal = 0;

        for (int j = 1; j <= 7; j++) {   // as long as there are under oder even 7 rows loop this:
            if (j == startingDay) {
                for (int i = 1; i <= numberDay; i++) {
                    if (i <= 9) {
                        System.out.print(" " + i + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                    horizontal++;
                    if (horizontal % 7 == 0 && i != numberDay) { // this regulates Zeilenumbruch every 7 numbers

                        if (reihe < 4) { // stop if reihe over 4

                            System.out.println("");

                        }

                        reihe++;
                    }
                }
            } else if (horizontal < startingDay) { //Write as much " " as needed set by input: startingDay
                System.out.print("   ");
                horizontal++;
            }
            if (numberDay <= 2) { // if numberDay is too small to use big " "
                System.out.print("");
            }
        }
    }


    public static void guessingGame(int numbertoguess) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");

            int input = scanner.nextInt();
            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            } else if (input > numbertoguess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (input == numbertoguess) {
                System.out.println("You won wisenheimer!");
                return;
            } else if (input < numbertoguess) {
                System.out.println("The number AI picked is higher than your guess.");

            }


        }


    }


    public static int randomNumberBetweenOneAndHundred() {

int number;
        Random random = new Random();

        number = random.nextInt(100);

        if (number <= 1) {
            number = random.nextInt();
        }
        if (number >= 100) {
            number = random.nextInt();
        }

        return number;



    }


    //public static int randomNumberBetweenOneAndHundred(){


    //nächste Zeitle = Direktes Zitat aus https://www.w3schools.com/java/java_math.asp (zuletzt aufgerufen 20.10.2022


    public static void main(String[] args) {
        App.oneMonthCalendar(30, 6);
        App.guessingGame(randomNumberBetweenOneAndHundred());


    }
}



