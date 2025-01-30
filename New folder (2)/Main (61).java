/******************************************************************************
21/10/2021
Java Arrays

*******************************************************************************/
// What is array ?
// 1. indexed (i)
// 2. fixed (size)
// 3. random access (a[2])
// 4. contigously/ sequentially allocated (2000,2004,2008)
// 5. homogeneous
public class Main
{
    //Array is the Object (Blue Print) so use new to allocate the memory. (This helps while using functions .length ...)
    // new operators creates a blue print & allocate the memory (dynamic)
	public static void main(String[] args) {
		int[] nos = new int[6]; //declaration & defination (for constructor we use () but here its array[])
		int[] age = {19,20,21,22,23,24}; //declaration & defination
		
		//Defautl Inititialation
// 		int, double, float = 0
//      boolean = false
//      char = \u0000
//      String (class type) = null

//index must be positive (int, byte & short only)
//IndexOutOfBoundsException : when we access more than actual size

//Assigning another array to another array
int[] a = {1,2,3,4};
int[] b = a;

	}
}

