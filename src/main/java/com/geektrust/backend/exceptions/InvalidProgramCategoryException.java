package com.geektrust.backend.exceptions;

public class InvalidProgramCategoryException extends RuntimeException {

    public InvalidProgramCategoryException() {
        super();
    }

    public InvalidProgramCategoryException(String message) {
        super(message);
    }
}