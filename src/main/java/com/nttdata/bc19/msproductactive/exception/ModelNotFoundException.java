package com.nttdata.bc19.msproductactive.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends RuntimeException{

    public ModelNotFoundException(String message){
        super(message);
    }
}