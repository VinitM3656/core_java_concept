/******************************************************************************

37. How to use forEach() method?


Collection classes which extends Iterable interface can use forEach loop to iterate elements. (Collection Framework)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.forEach((item)->{
		    System.out.println("Element :");
		    System.out.println(item);
		});
	}
}


