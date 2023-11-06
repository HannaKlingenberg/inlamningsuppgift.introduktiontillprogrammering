package inlamningsuppgift;

import java.util.Objects;
import java.util.Scanner;

/*Del 2
❖ Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
❖ När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop
❖ Programmet skall bestå av tre klasser:
❖ En klass som läser in text och skriver ut resultatet till användaren Mainklass
❖ En klass som räknar raderna och har koll på antalet tecken Logikklass
❖ En testklass

❖ Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
❖ Till programmet skall minst tre Junit-testfall skrivas Testklass
❖ Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet
❖ Vidareutveckla ditt program i del 2 så att programmet även gör följande:
❖ Skriver ut antal ord (separerade med blanksteg)
❖ Skriver ut det längsta ordet
❖ Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen”
❖ Programmet skall fortfarande bestå av tre klasser:
❖ En klass som läser in text och skriver ut resultatet till användaren
❖ En annan klass som: 1 Räknar raderna, antal tecken och antal ord 2 Har koll på det längsta ordet 3 Har koll på om användaren har skrivit ordet stop eller inte
❖Testklass
*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Logic metod = new Logic();

        String text = "";

        // läa in text tills användaren skriver stopp //flytta kontrollen till logikklassen
        while (!Objects.equals(text, "stopp")) {
            System.out.println("Please enter some text. When you are done write 'stopp'.");
            text = scan.nextLine();
            if (!Objects.equals(text, "stopp")) {
                metod.countChars(String.valueOf(text)); // stämmer
                metod.countWords(String.valueOf(text)); // stämmer
                metod.countLines(String.valueOf(text)); // stämmer
                metod.longestWord(String.valueOf(text)); // stämmer
            }
        }

        System.out.println("Texten har " + metod.getChars() + " antal tecken.");
        System.out.println("Texten har " + metod.getWords() + " antal ord.");
        System.out.println("Texten har " + metod.getLines() + " antal rader.");
        System.out.println("Det längsta ordet i texten är " + metod.getLongestWord() + ".");
    }

}
