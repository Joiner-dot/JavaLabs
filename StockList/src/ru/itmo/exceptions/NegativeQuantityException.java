package ru.itmo.exceptions;

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException(Throwable err) {
        super(err);
    }
}
