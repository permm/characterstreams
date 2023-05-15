package characterstreams;

import java.io.*;

public class Lab4 {
    public static void main(String[] args) {
        try {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.print("Enter your name: ");
        String name = input.readLine();
        System.out.println("Hello "+ name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
