/******************************************************************************

Variables in Java

*******************************************************************************/
public class Main
{
// Primitive Data Types

// 1. int
// 2. byte
// 3. short
// 4. long

// 1. char

// 1. float
// 2. double

// 1. boolean

// Reference Data Types (Reference to the class)

// String s; -> s is the reference variable
// Person p; -> p is --||--


// Variables Types 
// 1. Instance         (Non-Static Class Variables)
// 2. Class/Static     (Static Class Variables)
// 3. Local            (Method Variables)
	
	String name; //reference - instance (Heap memory)
	int age;     //Primitive - instance
	
	static String planet; //reference - static/class
	
	public static void main(String[] args) {  //local main - stack memory
	    Person p; //reference - local
	    
	}
}

