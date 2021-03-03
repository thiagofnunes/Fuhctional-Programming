package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Thiago").orElseGet(() -> "default");
        System.out.println(value);

        //Object value2 = Optional.ofNullable(null).orElseThrow(() -> new IllegalArgumentException("Error"));
        //System.out.println(value2);

        Optional.ofNullable("thiagofnunes13@gmail.com").ifPresent(System.out::println);

        Optional.ofNullable("Thiago Nunes").ifPresentOrElse(
                name -> System.out.println(name),
                () -> System.out.println("No default value"));

    }
}
