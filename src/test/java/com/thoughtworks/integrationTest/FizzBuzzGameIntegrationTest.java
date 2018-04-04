package com.thoughtworks.integrationTest;
/*
Don't change this file
*/

import com.thoughtworks.FizzBuzzGame;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;
public class FizzBuzzGameIntegrationTest {
    @Test
    public void testFizzBuzzGameResults() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz"
        );


        FizzBuzzGame game = new FizzBuzzGame();
        game.start(100);
        List<String> results = game.getResults();
        assertThat(results, equalTo(expectedResults));
    }
}