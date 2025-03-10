import java.util.Scanner;

class Video12{

    public static void main(String args[])
    {

        Scanner bank=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=bank.nextInt();
        System.out.println("Enter your age");
        int age=bank.nextInt();
        if(salary>=200000 || age<=25)
        {
            System.out.println("Eligible for the loan");
            System.out.println("Enter the amout of the loan");
            int loan=bank.nextInt();

            if(loan<=50000)
            {
                System.out.println("You can get the loan");
            }
            else
            {
                 System.out.println("Max loan is 50000");
            }

        }

        else{
            System.out.println("Not eligible fot the loan");
        }
       

        



    }
}