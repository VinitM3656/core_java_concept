/******************************************************************************

forEach & iterable interface

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Samir");
		al.add(34);
		al.add(33900.0);
		al.add("Zensar");
		
		al.forEach((element)->{
		    System.out.println(element);
		});
		
	   // we still have iterable method, we can use.	
	}
}

