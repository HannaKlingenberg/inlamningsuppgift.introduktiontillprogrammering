package inlamningsuppgift;

import java.util.ArrayList;

public class Logic {

    // Attribut som metoderna sparar resultat i innan det hämtas.
    int chars = 0;
    int words = 0;
    int lines = 0;
    String longestWord = "";
    ArrayList<String> longestWords = new ArrayList<>();

    // Metod som går igenom input ord för ord och anropar övriga metoder.
    public boolean parseLine(String text) {
        String[] stringArray = text.split("\\s"); // Splittar upp på mellanslagen = ett ord/position.
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isEmpty()) {
                String word = stringArray[i];

                if (keepGoing(word) == false) { // Om keepGoing hittat stopp och returnerar false avbryts metoden...
                    return false;
                }

                countChars(word);
                countWords(word);  // ... annars anropas dessa för varje ord...
                longestWord(word);

            }
        }
        countLines(); // ... och denna för varje rad.
        return true;
    }

    // Metod som kontrollerar om input är "stopp".
    public boolean keepGoing(String text) {
        return !text.equalsIgnoreCase("stopp");
    }

    // Metod som räknar chars.
    public void countChars(String text) {

        chars = chars + (text.replace(" ", "").length());
    }

    public int getChars() {
        return chars;
    }

    // Metod som räknar ord.
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

    // Metod som räknar rader, plussar på en rad varje gång metoden kallas.
    public void countLines() {

        lines++;
    }

    public int getLines() {
        return lines;
    }

    // Metod som hittar de längsta orden.
    public void longestWord(String text) {
        String[] stringArray = text.split("[\\pP\\s&&[^’]]+"); // Förhindrar att metoden även räknar skiljetecken.
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