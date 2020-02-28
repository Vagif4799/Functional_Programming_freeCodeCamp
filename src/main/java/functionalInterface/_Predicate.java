package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // Normal Java Function
        System.out.println(isPhoneNumberValid("0099412"));
        System.out.println(isPhoneNumberValid("0994123"));

        // Predicate Functional Interface
        System.out.println(isPhoneNumberValidPredicate.test("0099412"));
        System.out.println(isPhoneNumberValidPredicate.test("0994123"));

        System.out.println(
                "Is phoneNumber contains 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("0994123")
        );

        System.out.println(
                "Is phoneNumber contains 3 with or: " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("0994123")
        );


    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("00994") && phoneNumber.length() == 7;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("00994") && phoneNumber.length() == 7;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
