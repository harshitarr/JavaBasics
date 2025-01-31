
1) without user define

import java.util.Scanner;

class video8
{
public static void main(String args[])
{

   String RCB="win" ;
   
   if(RCB.equals("win"))
   {
   System.out.println("el sala cup namathe");
   }

   else
   {
    System.out.println("cup illa daa");
   }


}

}



2) with user define

import java.util.Scanner;

class video8
{
public static void main(String args[])
{

   Scanner hi=new Scanner(System.in);
   System.out.println("Enter whether RCB won or not");
   String RCB=hi.nextLine();
   
   if(RCB.equals("win"))
   {
   System.out.println("el sala cup namathe");
   }

   else
   {
    System.out.println("cup illa daa");
   }


}
