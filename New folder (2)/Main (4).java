/******************************************************************************

LinkedHashSet

Difference between HashSet & LinkedHashSet is that : 
LinkedHashSet maintains the order.
AND
HashSet doesnot maintains the order.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    LinkedHashSet ls = new LinkedHashSet();
	    
	    ls.add("Samir");
	    ls.add(10);
	    ls.add(null);
	    ls.add("Samir");
	    ls.add(10);
	    ls.add(null);
	    ls.add("Samir");
	    ls.add(10);
	    ls.add(null);
	    
	    System.out.println(ls);
	}
}

