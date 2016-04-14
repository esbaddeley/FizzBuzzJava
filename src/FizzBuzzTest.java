import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by emmabaddeley on 14/04/2016.
 */
public class FizzBuzzTest {

    private String fizz;
    private String buzz;

    public FizzBuzzTest() {
        fizz = "Fizz";
        buzz = "Buzz";
    }

    @Test
    public void resultShouldEqualFizzIfMultipleOfThree (){
        assertEquals(fizz, FizzBuzz.getResults(3));
    }

    @Test
    public void resultShouldEqualBuzzIfMultipleOfThree (){
        assertEquals(buzz, FizzBuzz.getResults(5));
    }


}