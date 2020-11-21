package javaTvoHw;

public class tvo {

	public static void main(String[] args) {
		
// Creating sml prog that defines some fields------------
		
		int x = 9;
		int y = 10;
	    int z = 37;
	    float num1 = 4.0f;
	    float num2 = 13.0f;
	    boolean answer = true;
	    String txt = "Hello World!";
	    String firstName = "\nAnthony";
	    String lastName = "Davis\n";
	    String arMor = "Laker's Forward";
	    System.out.println((x + y + z) - (num2 - num1));
	    
// Creating some illegal fld names------------
	    
	/*  int q = 5.0;
	    int a = 7.7;
	    Float num3 = "This is not OK!";
	    
// Uninitialized fld------------

	    String readyOne;
	    int w;
	    int s;
	    System.out.println(a);
	    System.out.println(readyOne);  */
	    
// Using a Local Variable------------
	    
	    String fullName;
	    fullName = firstName + " " + lastName;
	    System.out.println(fullName.toUpperCase() + arMor);
	    
// Using a Local Variable to run Compiler Errors------------
	    
   /*	    String fublame;
	    fullName = firstName + " " + lastName;
	    System.out.println(fulName.toUpperCase() + arMor);   */
	}

}
