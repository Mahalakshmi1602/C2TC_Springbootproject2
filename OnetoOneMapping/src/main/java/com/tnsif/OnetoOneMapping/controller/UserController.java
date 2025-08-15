package com.tnsif.OnetoOneMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.OnetoOneMapping.entity.User;
import com.tnsif.OnetoOneMapping.service.UserServiceImpl;

import jakarta.persistence.NoResultException;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // Get all users
    @GetMapping("/users")
    public List<User> list() {
        return userService.getAllUsers();
    }

    // Add a new user
    @PostMapping("/users")
    public void add(@RequestBody User user) {
        userService.saveUser(user);
    }

    // Get user by ID
    @GetMapping("/users/{id}")
    public ResponseEntity<User> get(@PathVariable Long id) {
        try {
            User user = userService.getUserById(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete user by ID
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    // Update an existing user
    @PutMapping("/users/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User updatedUser) {
        try {
            User existingUser = userService.getUserById(id);

            // Update fields
            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            existingUser.setAddress(updatedUser.getAddress());
            existingUser.setDateOfBirth(updatedUser.getDateOfBirth());
            existingUser.setProfile(updatedUser.getProfile());

            userService.updateUser(id, existingUser);

            return new ResponseEntity<User>(existingUser, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
}
