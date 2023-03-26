package com.example.homeworks;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.\\-_*])([a-zA-Z0-9@#$%^&+=*.\\-_]){3,}$");
        Matcher matcher = pattern.matcher(value);

        if (!matcher.matches()) {
            return false;
        }

        if (value.length() < 8 || value.length() > 30) {
            return false;
        }

        return true;
    }
}
