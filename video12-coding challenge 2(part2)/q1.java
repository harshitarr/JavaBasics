import java.util.Scanner;

class Video12{

    public static void main(String args[])
    {

        Scanner comp=new Scanner(System.in);
        System.out.println("Enter the mark you obtained");
        int a=comp.nextInt();

        if(a>=70)
        {
            System.out.println("EXCELLENT PERFORMANCE");
        }

        else if(a<70 && a>=50)
        {
            System.out.println("GOOD JOB");


        }

        else
        {
            System.out.println("YOU NEED TO IMPROVE");
        }
    }
}