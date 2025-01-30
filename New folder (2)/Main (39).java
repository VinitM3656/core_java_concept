/******************************************************************************

Array Practice

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(arr); //address of arr.  //[I@3b22cdd0
		                                          //  "[" for single dimention
		                                          //  "I" for Integer type
		                                          //  "@5fdef03a" for Hexadecimal Address
		System.out.println(arr[0]);
		System.out.println(arr.length); // 0 - 4 (5)
		                                      
		String[] arr2 = {"Samir","Aftab","Khalil"};
		
		System.out.println(arr2); // [Ljava.lang.String;@1e81f4dc
		
// 		---------------------------------------------------------------------
        Reverse the string without using predefined method. (We can use toCharArray here but cannot use directly reverse method)
        String s = "Samir";
        
        char[] charArray = s.toCharArray();
        
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);
        System.out.println(charArray[3]);
        System.out.println(charArray[4]);
	}
}
