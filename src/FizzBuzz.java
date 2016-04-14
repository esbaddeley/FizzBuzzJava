/**
 * Created by emmabaddeley on 14/04/2016.
 */
public class FizzBuzz {


    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZBUZZ = "FizzBuzz";

    public static String getResults( int number ){
        if (number == 0) return Integer.toString(number);
        else if (multipleOfFifteen(number)) return FIZZBUZZ;
        else if (multipleOfThree(number)) return FIZZ;
        else if (multipleOfFive(number)) return BUZZ;
        return Integer.toString(number);
    }

    private static Boolean multipleOfThree(int number){
        return (number % 3 == 0);
    }

    private static Boolean multipleOfFive( int number){
        return (number % 5 == 0);
    }

    private static Boolean multipleOfFifteen( int number ) {
        return (multipleOfThree(number) && multipleOfFive(number));
    }
}
