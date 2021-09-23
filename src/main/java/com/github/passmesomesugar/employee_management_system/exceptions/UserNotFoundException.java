package com.github.passmesomesugar.employee_management_system.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
        super(s);
    }
}
