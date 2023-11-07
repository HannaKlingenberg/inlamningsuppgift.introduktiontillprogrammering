package inlamningsuppgift;

import java.util.Objects;
import java.util.Scanner;

/*Del 2
❖ Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stopp.
❖ När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stopp
❖ Programmet skall bestå av tre klasser:
❖ En klass som läser in text och skriver ut resultatet till användaren Mainklass
❖ En klass som räknar raderna, orden, tecknen och längsta ordet. Logikklass
❖ En testklass
❖ Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
❖ Till programmet skall minst tre Junit-testfall skrivas Testklass
❖ Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet
❖ Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen”

*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Logic metod = new Logic();

        String text = "";

        // läa in text tills användaren skriver stopp //flytta kontrollen till logikklassen

        while (metod.keepGoing(text)) {
            System.out.println("Please enter some text. When you are done write 'stopp'.");
            text = scan.nextLine();

            if (metod.keepGoing(text)) {

                metod.countChars(text);
                metod.countWords(text);
                metod.countLines(text);
                metod.longestWord(text);
            }
        }

        System.out.println("Texten har " + metod.getChars() + " antal tecken.");
        System.out.println("Texten har " + metod.getWords() + " antal ord.");
        System.out.println("Texten har " + metod.getLines() + " antal rader.");
        System.out.println("Det längsta ordet i texten är " + metod.getLongestWord() + ".");
    }
}

