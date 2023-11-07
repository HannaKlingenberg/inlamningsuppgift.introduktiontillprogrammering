package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

    //test längsta ord
    //test antal tecken
    //test mellanrum eller inte
    //test stop

    @Test
    public void testCountChars() {
        //Arrange
        Logic countChars = new Logic();
        int expected = 4;

        //Act
        countChars.countChars("hopp");

        //Assert
        assertEquals(expected, countChars.getChars());
    }

    @Test
    public void testCountLines() {
        //Arrange
        Logic countLines = new Logic();
        int expected = 1;

        //Act
        countLines.countLines("hej");

        //Assert
        assertEquals(expected, countLines.getLines());
    }

    @Test
    public void testCountLines2() {
        //Arrange
        Logic countLines = new Logic();
        int expected = 3;

        //Act
        countLines.countLines("hej");
        countLines.countLines("hej");
        countLines.countLines("hej");

        //Assert
        assertEquals(expected, countLines.getLines());
    }

    @Test
    public void testLongestWord() {
        //Arrange
        Logic longestWord = new Logic();
        String expected = "hoppsan";

        //Act
        longestWord.longestWord("Hej hoppsan hej.");

        //Assert
        assertEquals(expected, longestWord.getLongestWord());
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
    public void testKeepGoingStop() {
        //Arrange
        Logic keepGoing = new Logic();
        boolean expected = false;

        //Act
        boolean actual = keepGoing.keepGoing("stopp");

        //Assert
        assertEquals(expected, actual);

    }


}




