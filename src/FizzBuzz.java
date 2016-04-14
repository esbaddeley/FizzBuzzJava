/**
 * Created by emmabaddeley on 14/04/2016.
 */
public class FizzBuzz {

    public static String getResults( int number ){
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}
