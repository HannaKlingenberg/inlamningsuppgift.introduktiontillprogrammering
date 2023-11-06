package inlamningsuppgift;

public class Logic {

    int chars = 0;
    int words = 0;
    int lines = 0;
    String longestWord = "";

    public void countChars(String text) { // metod som räknar chars
        chars = chars + (text.replace(" ", "").length());    //sätt att inte räkna mellanslag
    }

    public int getChars() {
        return chars;
    }

    public void countWords(String text) { //metod som räknar ord
        int counter = 0;
        String[] stringArray = text.split("\\s");
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
        String[] lines = text.split("\r\n|\r|\n");
        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() != 0) {
                counter++;
            }
        }
        this.lines += counter;
    }

    public int getLines() {
        return lines;
    }

    public void longestWord(String text) { // metod som hittar längsta ordet
        String[] stringArray = text.split("\\s");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= longestWord.length())
                longestWord = stringArray[i];
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}



