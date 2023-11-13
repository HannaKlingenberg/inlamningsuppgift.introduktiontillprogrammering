package inlamningsuppgift;

import java.util.Objects;

public class Logic {

    //De attribut metoderna sparar i.
    int chars = 0;
    int words = 0;
    int lines = 0;
    String longestWord = "";

    // Metod för att kontrollera om användaren skrivit "stopp".
    public boolean keepGoing(String text) {
        return !Objects.equals(text, "stopp");
    }

    // metod som räknar chars
    public void countChars(String text) {
        chars = chars + (text.replace(" ", "").length()); //exkluderar mellanslag
    }

    public int getChars() {
        return chars;
    }

    // Metod som räknar ord
    public void countWords(String text) {
        String[] stringArray = text.split("\\s"); //splittar upp i array på mellanslagen, ett ord på varje plats, räknar platserna
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isEmpty()) {
                counter++;
            }
        }
        words += counter;
    }

    public int getWords() {
        return words;
    }

    // Metod som räknar rader
    public void countLines() {
        lines++;
    } //hindra att den räknar tomma rader?

    public int getLines() {
        return lines;
    }

    // Metod som hittar det längsta ordet
    public void longestWord(String text) {
        String[] stringArray = text.split("[\\pP\\s&&[^’]]+"); // förhindrar att metoden även räknar skiljetecken
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= longestWord.length())
                longestWord = stringArray[i];
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}



