package com.Heather;
        import java.io.*;
        import java.util.*;
/**
 * Created by iv2070fj on 2/11/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is the filename?");
        String filename=scan.nextLine();
        write(filename);
        read(filename);

    }
    private static void read(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader bufReader = new BufferedReader(reader);
        try {
            String line = bufReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
        }catch(IOException io){
            System.out.println("There was an error while reading "+filename+".");
        }
        bufReader.close();   //This closes the inner FileReader too
    }
    private static void write(String filename) throws IOException {

        FileWriter writer = new FileWriter(filename);
        BufferedWriter bufWriter = new BufferedWriter(writer);
        try {
            bufWriter.write("My name is Heather.\n");
            bufWriter.write("My favorite color is blue.\n");
            bufWriter.write("I am "+Integer.toString(33) + " years old.\n");
            bufWriter.close();
        }catch(IOException io){
            System.out.println("There was an error writing to the file "+filename+".");
        }

    }
}

