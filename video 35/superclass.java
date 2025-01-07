1) 

package why;



class animal
{
 animal()
 {
	 System.out.println("Animal");
 }
}
 
 class dog extends animal{
	 dog()
	 {
		System.out.println("dog") ;
	 }
 }

public class mainclss {

	public static void main(String[] args) {
		dog  d1=new dog();
		

		
		

	}

}


// using constructor as super keyword


2)


package why;



class animal
{
 animal(String name)
 {
	 System.out.println("meow");
 }
}
 
 class dog extends animal{
	 dog()
	 {
		super("meow");        // super class is used to pass the value to the string so it can work
		System.out.println("dog") ;
		
	 }
 }

public class mainclss {

	public static void main(String[] args) {
		dog  d1=new dog();
		

		
		

	}

}



3)


package why;



class animal
{
 animal(String name)
 {
	 System.out.println("meow");
	 
	 
	 
 }
 
 void makesound ()
 {
	 
	 System.out.println("meow");
 }
}
 
 class dog extends animal{
	 dog()
	 {
		super("meow");
		super.makesound();   // it can also be used to call a functinon
		System.out.println("dog") ;
		
	 }
 }

public class mainclss {

	public static void main(String[] args) {
		dog  d1=new dog();
		

		
		

	}

}

