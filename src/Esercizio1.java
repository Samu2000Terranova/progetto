import java.io.*;


public class Esercizio1 {
    public static void main(String[] args) throws Exception{

        String inputFile= "input.txt";
        String outFile ="out.txt";                //definiamo i nomi di input and ouput
       try {
           BufferedReader in = new BufferedReader(new FileReader("input.txt"));
           FileWriter out = new FileWriter("out.txt");

           String line;
           int linenumber =1;

           while((line = in.readLine()) != null){
                if (linenumber % 2 ==0){
                    out.write("\n");           //nuova linea vuota nel file di output
                } else {
                    System.out.println(line);
                    out.write(line);
                }
                linenumber++;
           }
           in.close();
           out.close();

       } catch (IOException e){
           e.printStackTrace();
           System.out.println(e);
       }


    }

}