/******************************************************************************

TreeSet

TreeSet gives the sorted list.
But, the datatype must be same for all elements.
It eliminates duplicate elements.

It implements Comparable only. 
But, all wrapper class implements Comparable.
Hence only wrapper classes are allowed. primitive not allowed.

Comparable is default natural sorting order.
Comparator is user defined custom sorting.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    TreeSet<Integer> ts = new TreeSet();
	    
	    ts.add(155);
	    ts.add(45);
	    ts.add(230);
	    ts.add(78);
	    ts.add(90);
	    ts.add(20);
	    ts.add(3);
	    ts.add(139);
	    
	    System.out.println(ts); // [3, 20, 45, 78, 90, 139, 155, 230]
	}
}

