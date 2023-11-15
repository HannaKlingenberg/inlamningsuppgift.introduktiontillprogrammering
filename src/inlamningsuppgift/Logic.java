package inlamningsuppgift;

import java.util.ArrayList;


public class Logic {

    //De attribut metoderna sparar i.
    int chars = 0;
    int words = 0;
    int lines = 0;
    String longestWord = "";
    ArrayList<String> longestWords = new ArrayList<>();


    // metod för att kunna gå igenom text ord för ord för att hitta "stopp" när det inte är på egen rad
    // och kallar på de andra metoderna
    public boolean parseLine(String text) {
        String[] stringArray = text.split("\\s");
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isEmpty()) {
                String word = stringArray[i];


                if (keepGoing(word) == false) {
                    return false;
                }

                countChars(word);
                countWords(word);
                longestWord(word);

            }
        }
        countLines();
        return true;
    }

    // Metod för att kontrollera om användaren skrivit "stopp".
    public boolean keepGoing(String text) {

        return !text.equalsIgnoreCase("stopp");
    }

    // metod som räknar chars
    public void countChars(String text) {

        chars = chars + (text.replace(" ", "").length());
    }

    public int getChars() {

        return chars;
    }

    // Metod som räknar ord
    public void countWords(String text) {
        String[] stringArray = text.split("\\s");
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
    }

    public int getLines() {

        return lines;
    }

    // Metod som hittar de längsta orden
    public void longestWord(String text) {
        String[] stringArray = text.split("[\\pP\\s&&[^’]]+"); // förhindrar att metoden även räknar skiljetecken
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() == longestWord.length()) {

                longestWord = stringArray[i];
                longestWords.add(longestWord);
            } else if (stringArray[i].length() > longestWord.length()) {
                longestWords = new ArrayList<>();
                longestWord = stringArray[i];
                longestWords.add(longestWord);
            }

        }
    }

    public ArrayList<String> getLongestWords() {
        return longestWords;
    }
}