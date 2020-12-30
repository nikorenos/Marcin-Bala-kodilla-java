package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {
    public static String ERR_TOO_SHORT_FRAZE = "Too short fraze! Enter at least three characters.";
    public static String ERR_NO_COMPANY_FOUND = "No company was found!";
    public static String ERR_NO_EMPLOYEE_FOUND = "No employee was found!";

    public SearchProcessingException(String message) {
        super(message);
    }
}
