package com.example.homeworks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Getter
@RequiredArgsConstructor
public class UserDto {
    @Id
    @GeneratedValue
    private UUID id;
    @NotBlank(message = "Nickname cannot be blank")
    private String nickname;
    @NameConstraint
    private String name;
    @NameConstraint
    private String surname;
    @PasswordConstraint
    private String password;
    @Min(value = 18, message = "Age must be greater than 18")
    @Max(value = 100, message = "Age must be less than 100")
    private int age;
    @Email(message = "Incorrect email address")
    private String email;
}
