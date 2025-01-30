/******************************************************************************

Dates

*******************************************************************************/

// Note* = toString() method is called by default from all objects, Only if constructor is empty. toString returns hashcode by default OTHERWISE toString is replaced by the written code.
// toString() gets overwridden if the constructor already has some code. If empty then toString() is executed.
import java.util.*;
import java.time.*;
public class Main
{
    // we can see here date & date.toString() both works same but internally replacement or not is happening
	public static void main(String[] args) {
	    Date date = new Date(); //java.util
		System.out.println("1. Date : "+date); // calling to Date Constructor (not empty here)
		System.out.println("1. Date : "+date.toString()); //hence, toString gets replaced by the Constructor code
		
		LocalDate localDate  =  LocalDate.now(); //java.time
		System.out.println("2. Local Date : "+localDate); // calling to LocalDate Constructor (not empty here)
		System.out.println("2. Local Date : "+localDate.toString()); //hence, toString gets replaced by the Constructor code
		
		//Demonstrating toString function
		Main m = new Main();
		System.out.println("3. Default Constructor : "+m); // calling to default constructor (its empty here)
		System.out.println("3. Default Constructor : "+m.toString()); // hence, toString() gets called & returns the hashCode
		
	}
}

