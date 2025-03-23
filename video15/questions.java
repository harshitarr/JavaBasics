1) Get inputs for a and b and print from a to b

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        Scanner meow=new Scanner(System.in);
        System.out.println("Enter the starting number :");
        int a=meow.nextInt();
        System.out.println("Enter the last number");
        int b=meow.nextInt();
        for (int i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
}


2) Print even numbers from 1 to 10

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
      
        for (int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}


3) count the number of odd numbers from 1 to 10

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        int count=0;
        for (int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                count=count+1;
            }
        }
        System.out.println("The number of odd numbers are : ");
        System.out.println(count);
    }
}

3) from 1 to 100 print all the numbers divisible by 3 and 5


import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        int count=0;
        for (int i=1;i<=100;i++)
        {
            if( i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
       
    }
}

