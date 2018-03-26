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

    private String current;

    @Override
    public boolean hasNext() {
        try {
            bufferedReader.mark(1);
            if (bufferedReader.read() != -1) {
                bufferedReader.reset();
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String next(){
      try {
          return bufferedReader.readLine();
      } catch (IOException io) {
          throw new NoSuchElementException();
      }
    }
}
