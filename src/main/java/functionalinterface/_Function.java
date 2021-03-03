package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(increment);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndMultiplyByTen = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndMultiplyByTen.apply(0));

        System.out.println(incrementByOneAndMultiply(4, 5));

        System.out.println(incrementByOneAndMultiplyFunction.apply(4, 5));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = (number, multiplier) -> (number + 1) * multiplier;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }
}
