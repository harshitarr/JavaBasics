1) array implementation

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        String[] playlist=new String[3];
        playlist[0]="song1";
        System.out.println(playlist[0]);
       
    }
}


2) method 2
import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        String[] playlist= {"song1","song2","song3"};
        System.out.println(playlist[0]);
       
    }
}


3) get inputs of 5 numbers and store them in an arrya and also fine the sum and avg

import java.util.Scanner;
class Coding
{
    public static void main(String args[])
    {
        int[] marks=new int[10];
        Scanner john=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter then value of n: ");
        int n=john.nextInt();
        System.out.println("enter the numbers one by one :")
        for(int i=0;i<n;i++)
        {
            marks[i]=john.nextInt();
            sum=sum+marks[i];


        }
        double avg=sum/n;
        System.out.println("avgerage="+avg);
       
    }
}