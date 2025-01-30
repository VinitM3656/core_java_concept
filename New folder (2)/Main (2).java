/******************************************************************************

ArrayList

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("A");
		a.add("A");
		a.add("A");
		a.add("A");
		a.add("A");
		System.out.println(a);
		
		System.out.println("-------------------------");
		for(int i = 0; i < a.size(); i++){ // benefit of for loop is it don't have any conditions. Elements of any type is allowed here.
		    System.out.println(a.get(i));
		}
		
		System.out.println("-------------------------");
		for(String i : a){ // problem with forEach is ArrayList must be of same type like String or integer.
		    System.out.println(i);
		}
	}
}

