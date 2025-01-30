/******************************************************************************

Vectors in java

- Vectors have capacity of 10 elements.
- New object is created when 1 vector exceeds the size of 10 elements.
- Vectors are single threaded. (One thread at a time)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Vector v = new Vector();
	    System.out.println(v.capacity());
	    v.add("String");
	    v.add(10);
	    v.add(20);
	    v.add(30);
	    v.add(10);
	    System.out.println(v);
	    System.out.println(v.capacity());
	    System.out.println("----------------------------");
	    
	    // here with the help of Enumeration we can fetch single element from the vector.
	    Enumeration e = v.elements();
	    while(e.hasMoreElements()){
	        System.out.println(e.nextElement());
	    }
	}
}
