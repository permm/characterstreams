package characterstreams;

import java.io.*;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Kub");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader file = new FileReader("data.txt");
            Scanner scan = new Scanner(file);
            String name = scan.nextLine();
            System.out.println(name);
            int age = scan.nextInt();
            System.out.println(age);
            double weight = scan.nextDouble();
            System.out.println(weight);
            double height = scan.nextDouble();
            System.out.println(height);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
