package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner nameOfUser = new Scanner(System.in);
        System.out.println( "What is the input string?" );
        String Name = nameOfUser.nextLine();
        System.out.println(Name+" has "+Name.length()+" characters.");
    }
}
