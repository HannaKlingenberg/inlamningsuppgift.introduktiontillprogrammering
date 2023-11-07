package inlamningsuppgift;

import java.util.Objects;

public class Logic {

    int chars = 0;
    int words = 0;
    int lines = 0;
    String longestWord = "";


    public boolean keepGoing(String text) { // måste på något sätt lyssna in texten och avgöra om boolean är true eller false
        return !Objects.equals(text, "stopp");
    }

    public void countChars(String text) { // metod som räknar chars
        chars = chars + (text.replace(" ", "").length());    //sätt att inte räkna mellanslag
    }
    public int getChars() {
        return chars;
    }

    public void countWords(String text) { //metod som räknar ord
        String[] stringArray = text.split("\\s");
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() != 0) {
                counter++;
            }
        }
        words += counter;
    }

    public int getWords() {
        return words;
    }

    public void countLines(String text) { //metod som räknar rader
        lines++;
    }
    public int getLines() {return lines;}

    public void longestWord(String text) { // metod som hittar längsta ordet
        String[] stringArray = text.split("\\s");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= longestWord.length())
                longestWord = stringArray[i];
        }
    }
    public String getLongestWord() {return longestWord;}
}



