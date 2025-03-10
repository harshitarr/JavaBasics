2) print 10 numbers from the array

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
       int numbers[]=new int[100];
       System.out.println("printing 10 numbers : ");
       for(int i=0;i<10;i++)
       {
        System.out.println(numbers[i]);
       }
       
    }
}

3)print two table

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
       int numbers[]=new int[100];
       System.out.println("printing 10 numbers : ");
       for(int i=0;i<10;i++)
       {
        numbers[i]=(i+1)*2;
        System.out.println("2 x "+ (i+1)+"="+numbers[i]);
       }
       
    }
}


4) calculate the median / the middle value of the array

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
       int numbers[]=new int[100];
       Scanner input=new Scanner(System.in);

       System.out.println("Enter the value of n: ");
       int n=input.nextInt();
       for(int i=1;i<=n;i++)
       {
          numbers[i]=input.nextInt();
          System.out.print(numbers[i]+" ");
       }
       if(n%2==0)
       {
        int j=(n/2)+1;
        int b=(n/2);
        double a=(double)(numbers[(n/2)+1]+numbers[(n/2)])/2;
        System.out.print("the middle element = "+a);
       }
       else
       {
        int c=(n+1)/2;
        System.out.print("the middle element= "+numbers[c]);
       }
       
    }
}