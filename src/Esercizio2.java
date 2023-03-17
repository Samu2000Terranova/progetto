
import java.io.*;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) throws Exception {
        int p;
        int num = 0;
        int linenumber=0;
        String line;
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        FileReader in = new FileReader("input.txt");
        FileWriter out = new FileWriter("contocaratteri.txt");
        while((line = input.readLine()) != null){
            linenumber++;

        }

//        while ((c = in.read()) != -1) {
//            System.out.printf("%c", c);
//            out.write(c);
//
//            num++;
//            System.out.println(", numero di caratteri letti: " + num);
//        }

        while ((p = in.read()) != -1) {
            System.out.printf("%c", p);
            num++;

        }
        out.write( "\nNumero di caratteri: " + num);
        out.write("\nNumero di righe:"+linenumber);
        out.flush();
        in.close();
        out.close();
    }
}