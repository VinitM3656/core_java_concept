/******************************************************************************

Q9. What is the difference between equals() and == in Java?

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

    // equals() is the method to compare two NUMBER OBJECTS.

    // e.g. 
    
    Integer a = 5;
    Integer b = 10;
    Integer c = 5;
    Short d = 5;

    // System.out.println(a.equals(d)); //integers are allowed
    // System.out.println(a==d);
    
    String s = "Samir";
    String z = "Samir";

    System.out.println(s.equals(z)); //strings are allowed
    System.out.println(s == z);
    
	}
}

// equals() :

// equals allows only Integer object types.
// it allows difference object types but will give false.

// == :

// == operator doesn't even allows the other type.
// == also allowed to compare the objects (wrapper classes) as at the end values are being checked.


// Strings and other classes are also allowed

// public boolean equals(Object o) 
