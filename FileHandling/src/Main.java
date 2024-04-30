import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Main{
    public static void main(String[] args){

//        try{
//            FileWriter f = new FileWriter("C:\\Users\\karma\\OneDrive\\Documentos\\fw.txt");
//            f.write("sjfhkjsfhkjshfkjhskjfhskjhf");
//            f.close();
//        }catch(Exception e){
//            System.out.println(e);
//        }
        try{
            FileReader fr = new FileReader("C:/Users/karma/OneDrive/Documentos/fw.txt");
            int r;
            while ((r = fr.read()) != -1) {
                if(r != 44) {
                    System.out.print((char)r);
                }else{
                    System.out.println("\n");
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
