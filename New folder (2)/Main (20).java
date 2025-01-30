/******************************************************************************

2. Explain public static void main(String args[]) in Java.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

public : public is an access modifier.
         this helps JVM to find main() method as
         public modifiers can be access from everywhere.
         
static : by using static we don't need to create the instance of the class in which main is declared.
         
void : It is the return type.
       void means the function does not return anything.
       
main : Its the name of method which we cannot change.
       This helps JVM to find this method.
       This main method serves as the starting point.
      
String args[] : It is the parameter passed to the main method.
