/******************************************************************************

Collection Framework 

The following example consists of ArrayList but same methods & concepts applies to LinkedList too

The major difference is Arrays are used for storing the data but LinkedLists are used for Manipulating the data
array follows the sequence whereas LinkedLists has double list which has an address that makes it easy to manipulate

https://www.javatpoint.com/difference-between-arraylist-and-linkedlist#:~:text=Difference%20between%20ArrayList%20and%20LinkedList%20%20%20,LinkedList%20is%20better%20for%20manipulating%20da%20...%20

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10); // auto-boxing : arrayList.add(new Integer(10)); WHY ? because Collections can only store Objects
		arrayList.add(20);
		arrayList.add(true);
		arrayList.add("Ajay");
		arrayList.add(false);
		arrayList.add("Samir");
		arrayList.add(null);
		arrayList.add("Ajay");
		
		System.out.println(arrayList); // Mixed type Objects
		
// 		-------------------------------------------------------------------------------------------
		
		ArrayList <String> stringList = new ArrayList<> (); 
		stringList.add("MongoDB");
		stringList.add("ExpressJS");
		stringList.add("ReactJS");
		stringList.add("NodeJS");
		System.out.println(stringList); // String type Objects
		
		arrayList.addAll(stringList); // Adding list 2 to list 1
		
		System.out.println(arrayList); // Printing updated list 1
		
		System.out.println("Does it contains 10 ? : "+arrayList.contains(10)); // true
		System.out.println("Does it contains List 2 ? : "+arrayList.containsAll(stringList)); // true
		
// 		-------------------------------------------------------------------------------------------
		
		arrayList.remove("Samir"); // removing single object from collection
		System.out.println(arrayList); // remove whole collection from a collection
		
		arrayList.removeAll(stringList); // we can only add whole collection
// 		arrayList.removeAll(["MongoDB","Express"]); // illegal
// 		arrayList.removeAll("MongoDB","Express"); // illegal
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size()); // 5 (0 - 4)

		System.out.println(arrayList.isEmpty()); // false
		
		
// 		arrayList.removeAll(arrayList); // temporary commented (remove it to understand it well)
		
		System.out.println(arrayList); // to remove all items from list 1
		
		System.out.println(arrayList.isEmpty()); // true
		
// 		--------------------------------------------------------------------

        arrayList.set(0,"Zero"); // set "Zero" at position 0
        System.out.println(arrayList);
        
        System.out.println(arrayList.get(1)); // get the object from position 1
        
        System.out.println(arrayList.indexOf("Zero")); // returns address of "zero" i.e. 0 (Case Sensetives)
        System.out.println(arrayList.indexOf("Ajay")); // returns address of "Ajay" i.e. 3 (Case Sensetives)
        System.out.println(arrayList.lastIndexOf("Ajay")); // returns 6 : last index of "Ajay" (Case Sensetives)
        
        System.out.println("\n"+arrayList);
        System.out.println(arrayList.subList(0,5)); // this will print 0 - 4 [Remember like 0 is position & 5 is size or number of elements] it will print 5 elements
	}
}

// Default capacity of Array list is 10 whereas Linked has 0

