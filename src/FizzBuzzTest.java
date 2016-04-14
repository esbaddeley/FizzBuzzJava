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

    public FizzBuzzTest() {
        fizz = "Fizz";
        buzz = "Buzz";
        fizzbuzz = "FizzBuzz";

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


}