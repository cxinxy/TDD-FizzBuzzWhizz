package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzGameTest {

    private FizzBuzzGame game = new FizzBuzzGame();

    @Test
    public void should_return_Fizz_when_have_3() {
        assertThat(game.play(3), is("Fizz"));
        assertThat(game.play(13), is("Fizz"));
        assertThat(game.play(23), is("Fizz"));
        assertThat(game.play(30), is("Fizz"));
        assertThat(game.play(31), is("Fizz"));
        assertThat(game.play(32), is("Fizz"));
        assertThat(game.play(33), is("Fizz"));
        assertThat(game.play(34), is("Fizz"));
        assertThat(game.play(35), is("Fizz"));
        assertThat(game.play(36), is("Fizz"));
        assertThat(game.play(37), is("Fizz"));
        assertThat(game.play(38), is("Fizz"));
        assertThat(game.play(39), is("Fizz"));
        assertThat(game.play(43), is("Fizz"));
        assertThat(game.play(53), is("Fizz"));
        assertThat(game.play(53), is("Fizz"));
        assertThat(game.play(63), is("Fizz"));
        assertThat(game.play(73), is("Fizz"));
        assertThat(game.play(83), is("Fizz"));
        assertThat(game.play(93), is("Fizz"));
    }

    @Test
    public void should_return_Fizz_when_is_multiple_of_3_but_not_multiple_of_5_and_7(){
        assertThat(game.play(6), is("Fizz"));
        assertThat(game.play(9), is("Fizz"));
        assertThat(game.play(12), is("Fizz"));
        assertThat(game.play(18), is("Fizz"));
        assertThat(game.play(24), is("Fizz"));
        assertThat(game.play(27), is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_is_multiple_of_5_but_not_multiple_of_3_7_and_not_have_3(){
        assertThat(game.play(5), is("Buzz"));
        assertThat(game.play(20), is("Buzz"));
        assertThat(game.play(25), is("Buzz"));
        assertThat(game.play(40), is("Buzz"));
        assertThat(game.play(50), is("Buzz"));
        assertThat(game.play(100), is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_is_multiple_of_7_but_not_multiple_of_3_5_and_not_have_3() {
        assertThat(game.play(7), is("Whizz"));
        assertThat(game.play(14), is("Whizz"));
        assertThat(game.play(28), is("Whizz"));
        assertThat(game.play(49), is("Whizz"));
        assertThat(game.play(56), is("Whizz"));
        assertThat(game.play(77), is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_is_multiple_of_3_and_5_but_not_multiple_of_7_and_not_have_3() {
        assertThat(game.play(15), is("FizzBuzz"));
        assertThat(game.play(45), is("FizzBuzz"));
        assertThat(game.play(60), is("FizzBuzz"));
        assertThat(game.play(75), is("FizzBuzz"));
        assertThat(game.play(90), is("FizzBuzz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_multiple_of_5_and_7_but_not_multiple_of_3_and_not_have_3() {
        assertThat(game.play(70), is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzWhizz_when_is_multiple_of_3_and_7_but_not_multiple_of_5_and_not_have_3() {
        assertThat(game.play(21), is("FizzWhizz"));
        assertThat(game.play(42), is("FizzWhizz"));
        assertThat(game.play(84), is("FizzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_multiple_of_3_and_5_and_7_but_not_have_3() {
        assertThat(game.play(210), is("FizzBuzzWhizz"));
    }


}
