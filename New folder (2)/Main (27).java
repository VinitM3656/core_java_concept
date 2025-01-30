/******************************************************************************

Q8. What is the difference between Array list and vector in Java?

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
	}
}

// ArrayList VS Vector
// Array List is not synchronized.	               
// Vector is synchronized.

// Array List is fast as it’s non-synchronized.	
// Vector is slow as it is thread safe.

// If an element is inserted into the Array List, it increases its Array size by 50%.	
// Vector defaults to doubling size of its array.

// Array List does not define the increment size.	
// Vector defines the increment size.

// Array List can only use Iterator for traversing an Array List.	
// Vector can use both Enumeration and Iterator for traversing


Vectors are used to store objects.
Vectors don't need the size to be declared.
Vector v = new Vector(); 
Vector increases the size 100% i.e. doubles
Vectors have 2 methods to add the object to the list.
a) v.addElement("Element");
b) v.insertElementAt("Element","Position");
To display we can directly use println(v); // will display in []

Array are used to store data & not objects.
Arrays needs size to be declared.
Array a = new Array[10];
Array increases the size 50%; i.e. half
Array don't requires any method to assign the value. We can directly assign it.
We need a loop to display array elements or can use toString() method from util package 
        System.out.println(Arrays.toString(str_array));

