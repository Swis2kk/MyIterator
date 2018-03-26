package com.iterator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FileIterator implements Iterator<String> {


    private BufferedReader bufferedReader;

    public FileIterator(String path) {
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

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
    public String next() {
        try {
            return bufferedReader.readLine();
        } catch (IOException io) {
            throw new NoSuchElementException();
        }
    }
}
