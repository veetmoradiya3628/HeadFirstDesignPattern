package builder_java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            String dir = "D:\\HeadFirstDesignPattern\\headfirst-patterns\\src\\builder_java_io\\";
            String filePath = dir + "test.txt";
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
