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
                    if (horizontal % 7 == 0) { // this regulates Zeilenumbruch every 7 numbers
                        // && i != numberDay
                        // if (reihe < 4) { // stop if reihe over 4
                        System.out.println("");
                        //  }
                        reihe++;
                    }
                }
            } else if (horizontal < startingDay) { //Write as much " " as needed set by input: startingDay
                System.out.print("   ");
                horizontal++;
            }
            if (numberDay <= 2) { // if numberDay is too small to use big " " or doesnt need it
                System.out.print("");
            }
        }
        if (numberDay == 28) {
            System.out.println("");
        }
        //Curve fitting
    }


    public static void guessingGame(int numbertoguess) {
        Scanner scanner = new Scanner(System.in);

        //           for(int i =0;i <=20;i++) {
        //                System.out.println(numbertoguess);  // 0 to 100
        //             }


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

    public static boolean swapArrays(int [] a, int[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i = i + 1) {
            //add [i]b and [i]a and extract

            b[i] = b[i] + a[i];
            a[i] = b[i] - a[i];

            b[i] = b[i] - a[i];
        }
        //why do i need this? Curve fitting?

        return true;
    }

    public static int checkDigit(int[] digit) {
        int läng = digit.length;


        int zif = 0;
        int tmp = 0;
        int sum = 0;
        for (int i = 0; i < läng; i++) { //list array
            zif = digit[i]; //take value
            tmp = i + 2; //array place +2

            sum = sum + (zif *tmp);
            System.out.println(sum);


        }
        int sum2 = sum % 11;
       int rest = sum % 11;
        int checkDigit = 11 - rest;
        System.out.println(checkDigit);
        if (checkDigit == 10) return 0;
        if (checkDigit == 11) return 5;

        return checkDigit;
    }
 public static String camelCase(String s) {


        String satz = "";
        char[] chars = s.toCharArray();
        boolean klein;
        char c;

        boolean groß;
        boolean space;
        for (int i = 0; i < chars.length; i++) {
            c = chars[i];

            groß = c > 64 && c < 91;
            klein = c > 96 && c < 123;

            if (i == 0) {
                if (groß)
                    satz += c;
                if (klein)
                    satz += (char) (c - 32);
            } else {
                space = chars[i - 1] == 32;
                if (space) {
                    if (groß) satz += c;
                    if (klein) satz += (char) (c - 32);
                } else {
                    if (groß) satz += (char) (c + 32);
                    if (klein) satz += c;
                }
            }
        }

        return satz;
    }


    public static int randomNumberBetweenOneAndHundred() {

        int number; // must not be initialiced with "0" ((might only be relevant with old "solution"))
        Random random = new Random();

        return random.nextInt(100) + 1;
    }



    public static long[] lcg(long start) {

        long[] lcg = new long[10];
        long m = 0;
        m = (long) Math.pow(2, 31);
        long a = 1103515245;
        long c = 12345;

        // ""lcg[i]"" == i prints number from array
        for (int i = 0; i < lcg.length; i++) {
            lcg[i] = (a * start + c) % m;
            start = lcg[i];
        }

        return lcg;
    }


    public static void main(String[] args) {
         App.oneMonthCalendar(30, 6);
         App.guessingGame(randomNumberBetweenOneAndHundred());





    }
}


// Implement all methods as public static


// test your method implementations here
// make method calls
// print their results
// etc.


