package finalsection;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = String::toUpperCase;

        BiFunction<String, Integer, String> appendAgeToName = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("Invalid name");
            return name + " is " + age + " yo";
        };

        System.out.println(appendAgeToName.apply("Thiago Nunes", 29));

    }
}
