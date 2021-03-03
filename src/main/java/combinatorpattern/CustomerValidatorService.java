package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() >= 8;
    }

    private boolean isAdult(LocalDate localDate) {
        return Period.between(localDate, LocalDate.now()).getYears() >= 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isValidPhoneNumber(customer.getPhoneNumber())
                && isAdult(customer.getDateOfBirth());
    }

}
