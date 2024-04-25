package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Program {
    
    public static void main(String[] args) throws Exception {
        // System.out.println("Tjis is test code");
        var input = new FileInputStream("odied.txt");
        var output = new FileOutputStream("juned.txt");
        byte[] buffer = new byte[80];
        while(input.available() > 0){
            int n = input.read(buffer, 0, buffer.length);
            Transformer.transform(buffer, n);
            output.write(buffer, 0, n);
        }
        output.close();
        input.close();
    }
}

