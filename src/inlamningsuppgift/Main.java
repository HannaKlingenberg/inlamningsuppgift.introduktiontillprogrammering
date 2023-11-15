package inlamningsuppgift;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Logic metod = new Logic();
        String text;


        System.out.println("Please enter some text. When you are done write 'stopp'.");

        // Läs in text så länge användaren inte skriver stopp.
        do {
            text = scan.nextLine();
        }
        while (metod.parseLine(text));


        // Skriv ut informationen när alla metoder är färdiga
        System.out.println("Texten har " + metod.getChars() + " antal tecken.");
        System.out.println("Texten har " + metod.getWords() + " antal ord.");
        System.out.println("Texten har " + metod.getLines() + " antal rader.");
        System.out.println("De längsta orden i texten är " + metod.getLongestWords() + ".");
    }
}