package sap;

import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Give the path length");
            Integer n = scan.nextInt();
            System.out.print("Amount of possible paths: " + functions.lenghtOfSelvAvoidingPath(n) + "\n");
        }
    }
}
