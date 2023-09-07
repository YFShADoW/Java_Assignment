/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purchaseordermanagementsystem;

/**
 *
 * @author weily
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputValidation {

    public static boolean checkIsInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkIsDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkValidPrice(String input) {
        if (checkIsDouble(input)) {
            double price = Double.parseDouble(input);
            return price >= 0;
        }
        return false;
    }

    public static boolean checkValidQuantity(String input) {
        if (checkIsInt(input)) {
            int quantity = Integer.parseInt(input);
            return quantity >= 0;
        }
        return false;
    }

    public static boolean checkValidDate(String input) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(input, formatter);
            // Optionally, you can add additional date validation logic here if needed.
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkValidPhoneNumber(String input) {
        // Define a regular expression pattern for phone numbers
        String phoneNumberRegex = "^(01\\d-\\d{4} \\d{4}|03-\\d{4} \\d{4})$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean checkValidEmail(String input) {
        // Use an email validation library or regular expression as shown in the previous answers.
        // Apache Commons Validator can also be used for email validation.
        // Email validation is typically separate from phone number validation.
        return false; // Placeholder
    }

}

