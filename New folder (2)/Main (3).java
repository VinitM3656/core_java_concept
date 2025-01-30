/******************************************************************************

HashSet in Java

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add("String");
		h.add("String");
		h.add("String");
		h.add(10);
		h.add(10);
		h.add(10);
		h.add(20);
		h.add(20);
		h.add(20);
		h.add(null);
		h.add(null);
		h.add(null);
		
		System.out.println(h); // repeated elements are skiped in HashSet & Sequence is Reversed null > 20 > 10 > String
	}
}


