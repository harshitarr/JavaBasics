import java.util.Scanner;

class Video12{

    public static void main(String args[])
    {

        Scanner comp=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subject : ");
        System.out.println("Mark 1 :");
        int a=comp.nextInt();
        System.out.println("Mark 2 :");
        int b=comp.nextInt();
        System.out.println("Mark 3 :");
        int c=comp.nextInt();
        System.out.println("Mark 4 :");
        int d=comp.nextInt();
        System.out.println("Mark 5 :");
        int e=comp.nextInt();
        int sum=a+b+c+d+e;
        double avg=(double)(sum)/5;
        System.out.println("sum : "+sum);
        System.out.println("avg: "+avg);
        if (avg<35)
        {
            System.out.println("additional classes are required!");

        }
        else
        {
            System.out.println("you are good to go");
        }







    }
}