package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {

        hello("Thiago", null, firstName -> System.out.println("Last name not provided for " + firstName));
        hello2("Thiago", null, () -> System.out.println("Last name not provided"));

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }

    static void hello2(String firstName, String lastName, Runnable runnable) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            runnable.run();
        }

    }
}
