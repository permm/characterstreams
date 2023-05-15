package characterstreams;

import java.io.*;
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello "+ name);
        System.out.print("Enter your weight: ");
        Double w = s.nextDouble();
        System.out.print("Enter your height: ");
        Double h = s.nextDouble();
        System.out.print("Weight x Height : " + w*h);
    }
}
