package org.example.exception;

public class InvalidEmailException extends Exception {
    // to customize this class we can add more fields...

    public InvalidEmailException(String message) {
        super(message);
    }


}
