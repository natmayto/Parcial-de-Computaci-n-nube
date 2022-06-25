package com.taller.taller.exceptions;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class TodoExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public TodoExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
