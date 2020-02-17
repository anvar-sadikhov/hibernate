package com.developia.hibernate.exceptions;

public class NotFoundException extends RuntimeException  {
    public NotFoundException(String message){
        super(message);
    }

}
