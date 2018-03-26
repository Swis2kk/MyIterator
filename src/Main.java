import com.iterator.MyIterator;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String path = "";

        try {
            MyIterator myIterator = new MyIterator(new BufferedReader(new FileReader(path)));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }


    }
}
