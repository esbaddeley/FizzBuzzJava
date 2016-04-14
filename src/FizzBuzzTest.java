import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by emmabaddeley on 14/04/2016.
 */
public class FizzBuzzTest {

    private String fizz;
    private String buzz;
    private String fizzbuzz;
    private Integer number;
    private Integer zero;

    public FizzBuzzTest() {
        fizz = "Fizz";
        buzz = "Buzz";
        fizzbuzz = "FizzBuzz";
        number = 7;
        zero = 0;
    }

    @Test
    public void resultShouldEqualFizzIfMultipleOfThree (){
        assertEquals(fizz, FizzBuzz.getResults(3));
    }

    @Test
    public void resultShouldEqualBuzzIfMultipleOfThree (){
        assertEquals(buzz, FizzBuzz.getResults(5));
    }

    @Test
    public void resultShouldEqualFizzBuzzIfMultipleOfThreeAndFive (){
        assertEquals(fizzbuzz, FizzBuzz.getResults(15));
    }

    @Test
    public void resultShouldEqualNumberPassedIfNotMultiple(){
        assertEquals(number.toString(), FizzBuzz.getResults(number));
    }

    @Test
    public void resultShouldReturnZeroIfGivenZero(){
        assertEquals(zero.toString(), FizzBuzz.getResults(zero));
    }

}