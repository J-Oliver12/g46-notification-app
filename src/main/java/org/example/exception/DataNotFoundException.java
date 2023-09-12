package org.example.exception;

public class DataNotFoundException extends RuntimeException {
    //...

    private final String requestId;

    public DataNotFoundException(String message, String requestId) {
        super();
        this.requestId = requestId;
    }

    public String info() {
        return "Message: " + getMessage() + " RequestId: " + requestId;
    }
}
