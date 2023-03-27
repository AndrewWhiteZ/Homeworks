package com.example.homeworks;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface PasswordConstraint {
    String message() default "Password must match the following requirements:" +
                             " 1. Password length must be in range 8 and 30 characters" +
                             " 2. Password must contain at least one lowercase and one uppercase character" +
                             " 3. Password must contain at least one digit character" +
                             " 4. Password must contain at least one special character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
