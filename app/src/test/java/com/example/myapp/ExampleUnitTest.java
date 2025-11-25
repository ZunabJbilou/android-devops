package com.example.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {
    
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(15, 3 * 5);
    }

    @Test
    public void stringConcatenation_isCorrect() {
        String hello = "Hello";
        String world = "World";
        assertEquals("Hello World", hello + " " + world);
    }

    @Test
    public void testClickCounter() {
        // Simulation d'un compteur de clics
        int initialClicks = 0;
        int clicksToAdd = 5;
        int finalClicks = initialClicks + clicksToAdd;
        assertEquals(5, finalClicks);
    }
}
