package com.example.homeworks;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint, String> {
    final String digitCharRegex = "(?=.*[0-9])"; // Регулярное выражение поиска цифр
    final String lowercaseCharRegex = "(?=.*[a-z])"; // Регулярное выражение поиска букв нижнего регистра
    final String uppercaseCharRegex = "(?=.*[A-Z])"; // Регулярное выражение поиска букв верхнего регистра
    final String specialCharRegex = "(?=.*[@#$%^&+=.\\-_*])"; // Регулярное выражение поиска специальных символов
    final String lengthRegex = "([a-zA-Z0-9@#$%^&+=*.\\-_]){8,30}"; // Регулярное выражение проверки длины строки
    Pattern pattern = Pattern.compile("^" + digitCharRegex + lowercaseCharRegex +
            uppercaseCharRegex + specialCharRegex + lengthRegex + "$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
