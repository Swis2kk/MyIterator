package com.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

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
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String next() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
