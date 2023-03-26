package com.example.homeworks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping()
    public @ResponseBody ResponseEntity<String> createUser(@Valid @RequestBody UserDto user) {
        return ResponseEntity.ok("User: " + user.getName() + " " + user.getSurname() + " – created successfully");
    }

    @DeleteMapping()
    public @ResponseBody ResponseEntity<String> deleteUser(@Valid @RequestBody UserDto user) {
        return ResponseEntity.ok("User: " + user.getName() + " " + user.getSurname() + " – deleted successfully");
    }
}
