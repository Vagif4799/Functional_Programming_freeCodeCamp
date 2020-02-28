package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function takes one argument and produces one result

        int increment = incrementbyOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        Integer incrementAndMultiply = addBy1AndThenMultiplyBy10.apply(1);
        System.out.println(incrementAndMultiply);

        // BiFunction takes two arguments and produces one result

        int incrementByOneAndMultiplyNormalFunction = incrementByOneAndMultiply(4, 100);
        System.out.println(incrementByOneAndMultiplyNormalFunction);

        Integer incrementAndMultiplyWithBiFunction = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(incrementAndMultiplyWithBiFunction);

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    static int incrementbyOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
