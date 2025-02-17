1)
import java.util.Scanner;

class video8
{
public static void main(String args[])
{
    
   String a="one";
   String b="one";
   String c=b;

   System.out.println(a==c);

}

}


output
true


2)
import java.util.Scanner;

class video8
{
public static void main(String args[])
{
    
   String a=new String("one");
   String b="one";
   String c=b;

   System.out.println(a==c);

}

}

output
false

because here one compares the reference with the contents in the string
