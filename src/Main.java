import com.iterator.MyIterator;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String path = "D:/file.txt";
        MyIterator myIterator;

        try {
            myIterator = new MyIterator(new BufferedReader(new FileReader(path)));


            myIterator.hasNext();
            myIterator.hasNext();


            System.out.println(myIterator.next());
            System.out.println(myIterator.next());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
