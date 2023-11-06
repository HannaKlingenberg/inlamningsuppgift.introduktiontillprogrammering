package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tester {

    //test längsta ord
    //test antal tecken
    //test mellanrum eller inte
    //test stop

    @Test
    public void testCountWords(){
        //Arrange
        Logic countWords = new Logic ();
        int expected = 2;

        //Act
        countWords.countWords("Hej hopp");

        //Assert
        assertEquals(expected, countWords.getWords());
    }

    @Test
    public void testCountLines(){
        //Arrange
        Logic countLines = new Logic ();
        int expected = 2;

        //Act
        countLines.countLines("Hej hopp \n hur mår du?");

        //Assert
        assertEquals(expected, countLines.getLines());
    }



}




