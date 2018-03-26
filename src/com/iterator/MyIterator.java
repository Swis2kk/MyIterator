package com.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator <String> {


    private BufferedReader bufferedReader;

    public MyIterator (BufferedReader bufferedReader){
        this.bufferedReader=bufferedReader;
    }

    @Override
    public boolean hasNext() {
        try {
            return bufferedReader.readLine() != null;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String next() throws NoSuchElementException {
       try {
           return bufferedReader.readLine();
       } catch (IOException o){
           throw new NoSuchElementException();
       }
    }
}
