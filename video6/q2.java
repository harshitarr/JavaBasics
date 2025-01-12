import java.lang.System;
import java.util.Scanner;

class Video6_q1{
    public static void main(String args[])
    {
Scanner john = new Scanner(System.in);
System.out.println("Enter the value of a : ");
int a=john.nextInt();
System.out.println("Enter the value of b : ");
int b=john.nextInt();
System.out.println("Enter the value of c : ");
int c=john.nextInt();
int d = a*b*c;
int e= a+b+c;
System.out.println("D = "+ d);
System.out.println("e = "+ e);

System.out.println("final ans : "+ (double)d/e);



}
}