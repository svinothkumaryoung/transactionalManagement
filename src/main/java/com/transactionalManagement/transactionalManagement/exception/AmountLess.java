package com.transactionalManagement.transactionalManagement.exception;

public class AmountLess extends RuntimeException{
    public AmountLess(String err)
    {
        super(err);
    }
}
