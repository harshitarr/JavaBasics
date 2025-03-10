import java.util.Scanner;

class Video12{

    public static void main(String args[])
    {

        Scanner signal=new Scanner(System.in);
        System.out.println("Enter the traffic signal : ");
        String a=signal.nextLine();
        String s1="RED";
        String s2="YELLOW";
        String s3="GREEN";
        if(a.equals(s1))
        {
            System.out.println("STOP");

        }

        else if(a.equals(s2))
        {
            System.out.println("ready");

        }

        else if(a.equals(s3))
        {
            System.out.println("GO");
        }
        else
        {
            System.out.println("ERROR");
        }







    }
}