1)

import java.util.Scanner;

class video8
{
public static void main(String args[])
{

   Scanner hi=new Scanner(System.in);
   System.out.println("Enter the marks:");
   int mark=hi.nextInt();
   if(mark>35)
   {
      System.out.println("passed");

   }

   else
   {
      System.out.println("not passed");
   }


}

}



2)// to check whther it is divisible by 3 and 5

import java.util.Scanner;

class video8
{
public static void main(String args[])
{

   Scanner hi=new Scanner(System.in);
   System.out.println("Enter the marks:");
   int mark=hi.nextInt();
   if(mark%3==0 && mark%5==0)
   {
      System.out.println("divisible by both 3 and 5");

   }

   else
   {
      System.out.println("not divisible");
   }


}

}


3)

import java.util.Scanner;

class video8
{
public static void main(String args[])
{

   Scanner hi=new Scanner(System.in);
   System.out.println("Enter the number:");
   int no=hi.nextInt();
   if(no%2==0)
   {
      System.out.println("even");

   }

   else
   {
      System.out.println("odd");
   }


}