package characterstreams;

import java.io.*;

public class Lab5 {
    public static void main(String[] args) {
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name: ");
            String name = input.readLine();
            System.out.println("Hello "+ name);
            System.out.print("Enter your weight: ");
            String w = input.readLine();
            System.out.print("Enter your height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(h)*Double.parseDouble(w));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
