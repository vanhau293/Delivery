package com.example.demo.exception;

public class DuplicateException extends RuntimeException{
    public DuplicateException(String msg)
    {
        super(msg);
    }
}
