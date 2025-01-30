/******************************************************************************

Stack in Java

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Ajay");
        s.add(10);
        s.add(null);
        s.add("Samir");
        System.out.println(s.empty()); // false
        System.out.println(s); // [Ajay, 10, null, Samir]
        System.out.println(s.pop()); // Samir
        System.out.println(s); // [Ajay, 10, null]
        System.out.println(s.search(null)); // 1
        System.out.println(s.search("Ajay")); // 3
        System.out.println(s.search("Samir")); // -1
        System.out.println(s.peek()); // null
        
        // null > 10 > Ajay
	}
}

