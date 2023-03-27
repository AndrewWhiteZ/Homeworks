package com.example.homeworks;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
@NotBlank(message = "Name and surname cannot be blank")
@Pattern(regexp = "^\\S*$", message = "Name and surname cannot contain whitespaces") /* Регулярное выражение проверяет строку на отсутствие пробелов */
@Size(min = 2, message = "Name and surname must contain at least two characters")
public @interface NameConstraint {
    String message() default "Name and surname must contain at least two characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default { };
}
