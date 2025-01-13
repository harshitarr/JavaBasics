import java.util.Scanner;

class video8
{
public static void main(String args[])
{
    Scanner harshi=new Scanner(System.in);
    int a=harshi.nextInt();
    int b=harshi.nextInt();
    if(a>b)
    {
        System.out.println("a is greater");
    }

    else if( a<b)
    {
        System.out.println("A is smaller then B");
    }

    else 
    {
      System.out.println("a is equal to b");  
    }
  
}

}