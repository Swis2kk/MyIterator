import com.iterator.FileIterator;

public class Main {

    public static void main(String[] args) {

        String path = "D:/file.txt";
        FileIterator fileIterator = new FileIterator(path);

        System.out.println(fileIterator.hasNext());
        System.out.println(fileIterator.next());
    }
}
