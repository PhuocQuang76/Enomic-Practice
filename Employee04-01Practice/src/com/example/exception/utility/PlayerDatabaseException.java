package com.example.exception.utility;

public class PlayerDatabaseException extends Exception{

    public PlayerDatabaseException(){};

    public PlayerDatabaseException(String message){
        super(message);
    }
}
