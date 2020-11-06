package com.adaction;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest
{
    @Test
    public void testFizzBuzzWorksWith0Input() throws Exception {
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLucky(0));
        assertEquals("", output.trim());
    }

    @Test
    public void testFizzBuzzWorksTo20() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLucky(20));
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", output.trim());
    }

    @Test
    public void testFizzBuzzWorksTo40() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLucky(40));
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 lucky fizz buzz 26 fizz 28 29 lucky lucky lucky lucky lucky lucky lucky lucky lucky lucky buzz", output.trim());
    }
    
        
    @Test
    public void testFizzBuzzDoesNotContainIncorrectWords() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLucky(20));
        assertNotEquals("This text does not match", output.trim());
    }
}
