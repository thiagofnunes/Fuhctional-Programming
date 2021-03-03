package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("845389538"));
        System.out.println(isPhoneNumberValid("8453895388"));

        System.out.println();

        System.out.println(isPhoneNumberValidPredicate.test("845389538"));
        System.out.println(isPhoneNumberValidPredicate.test("8453895388"));

        System.out.println();

        System.out.println(isPhoneNumberValidPredicate.and(constainsNumberFive).test("845389538"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("8") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("8") && phoneNumber.length() == 9;

    static Predicate<String> constainsNumberFive = phoneNumber -> phoneNumber.contains("5");

}
