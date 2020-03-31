package demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("10_IO\\c.txt"));

        /*String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}
