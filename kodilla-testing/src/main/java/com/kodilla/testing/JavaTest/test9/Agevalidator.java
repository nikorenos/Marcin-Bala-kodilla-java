package com.kodilla.testing.JavaTest.test9;

class AgeValidator {
    public boolean validate(int age) throws WrongValue, UserTooYoungException {
        if (age < 1 || age > 150) {
            throw new WrongValue();
        } else if (age < 18) {
            throw new UserTooYoungException();
        }
        return true;
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        Boolean result;

        try {
            result = validator.validate(-12);
        } catch (WrongValue | UserTooYoungException e) {
            result = false;
        }
        System.out.println(result);
    }
}

class WrongValue extends Exception {

}

class UserTooYoungException extends Exception {

}
