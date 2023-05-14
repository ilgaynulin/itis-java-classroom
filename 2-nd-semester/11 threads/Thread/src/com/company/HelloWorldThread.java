package com.company;

import java.util.Date;

public class HelloWorldThread extends Thread {
    private Date date;
    private boolean throwException;

    public HelloWorldThread(Date date, boolean throwException) {
        this.date = date;
        this.throwException = throwException;
    }

    @Override
    public void run() {
        System.out.println("Today is " + date);
        if(throwException) {
            throw new NullPointerException();
        }
    }
}
