package com.iterator;

import com.generic.Type;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class MyIterator implements Iterator <String> {

    private BufferedReader bufferedReader= null;

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
            if (hasNext()) return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
