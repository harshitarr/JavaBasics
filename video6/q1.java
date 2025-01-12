import java.lang.System;
import java.util.Scanner;

class Video6_q1{
    public static void main(String args[])
    {
    Scanner john=new Scanner(System.in);
    System.out.println("Enter the age : ");
    int a=john.nextInt();
    john.nextLine();
    System.out.println("Enter your name : ");
    String b=john.nextLine();
    System.out.println("age : "+ a);
    System.out.print("Name: " + b);
    }
}





other one : (give the string input first to avoid john.nextLine())

import java.lang.System;
import java.util.Scanner;

class Video6_q1{
    public static void main(String args[])
    {
    Scanner john=new Scanner(System.in);
    System.out.println("Enter your name : ");
    String b=john.nextLine();
    System.out.println("Enter the age : ");
    int a=john.nextInt();
    
    
    System.out.println("age : "+ a);
    System.out.print("Name: " + b);
    }
}