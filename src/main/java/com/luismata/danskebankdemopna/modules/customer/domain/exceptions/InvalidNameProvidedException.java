package com.luismata.danskebankdemopna.modules.customer.domain.exceptions;

public class InvalidNameProvidedException extends IllegalArgumentException{
    public InvalidNameProvidedException(String errorMessage) {
        super(errorMessage);
    }
}
