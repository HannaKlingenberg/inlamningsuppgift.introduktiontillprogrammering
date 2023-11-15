package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLogic {


    @Test
    public void testKeepGoingStop() {
        //Arrange
        Logic keepGoing = new Logic();
        boolean expected = false;
        //Act
        boolean actual = keepGoing.keepGoing("stopp");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testKeepGoingContinue() {
        //Arrange
        Logic keepGoing = new Logic();
        boolean expected = true;
        //Act
        boolean actual = keepGoing.keepGoing("");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountChars() {
        //Arrange
        Logic countChars = new Logic();
        int expected = 4;
        //Act
        countChars.countChars("hopp");
        int actual = countChars.getChars();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWords() {
        //Arrange
        Logic countWords = new Logic();
        int expected = 4;
        //Act
        countWords.countWords("hopp, hopp, hopp, hopp");
        int actual = countWords.getWords();
        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testCountLines() {
        //Arrange
        Logic countLines = new Logic();
        int expected = 1;
        //Act
        countLines.countLines();
        int actual = countLines.getLines();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWords() {
        //Arrange
        Logic longestWord = new Logic();
        String expected = "hoppsan";
        //Act
        longestWord.longestWord("Hej hoppsan hej.");
        String actual = longestWord.getLongestWords().get(0);
        //Assert
        assertEquals(expected, actual);
    }

}




