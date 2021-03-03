package combinatorpattern;

import java.time.LocalDate;
import java.time.Month;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicagmail.com",
                "845389538",
                LocalDate.of(1992, Month.MAY, 15)

        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult()).apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }


    }

}
