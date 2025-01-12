import java.lang.System;
import java.util.Scanner;

class Video6_q1{
    public static void main(String args[])
    {
Scanner john = new Scanner(System.in);
System.out.println("Enter your name : ");
String a=john.nextLine();
System.out.println("Enter the department:  ");
String b=john.nextLine();
System.out.println("Enter your score: ");
int c=john.nextInt();
double d=((double)c/100)*10;
System.out.println("Name : "+a);
System.out.println("Department "+b);
System.out.println("Mark out of 10 : "+d);


}
}