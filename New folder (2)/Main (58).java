/******************************************************************************
Variables don't gives the compilation error in infinite loop.

Constants gives the compilation error in infinite loop.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   // variables compliles successfully in infinite loop
	    int a = 1, b = 2;
		while(a < b){
		    System.out.println("Hello World");
		};
		System.out.println("Bye");
		
// 		constants values causes compilation error in infinite loop
// 		final int a = 1, b = 2;
// 		while(a < b){
// 		    System.out.println("Hello World");
// 		};
// 		System.out.println("Bye");
		
	}
}

