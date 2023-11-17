package inlamningsuppgift;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Logic metod = new Logic();
        String text;

        System.out.println("Skriv något, när du vill avsluta skriv 'stopp'.");

        do {
            text = scan.nextLine(); // Läser in en rad.
        }
        while (metod.parseLine(text)); // Fortsätter tills parseLine returnerar false.

        // Skriver ut resultatet.
        System.out.println("Texten har " + metod.getChars() + " antal tecken.");
        System.out.println("Texten har " + metod.getWords() + " antal ord.");
        System.out.println("Texten har " + metod.getLines() + " antal rader.");
        System.out.println("De längsta orden i texten är " + metod.getLongestWords() + ".");
    }
}