/******************************************************************************

20. How to Shuffle an Array in Java?

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    // Generate the random number within the range (range would be the length for arrays)
	    
	   // then swap that randomIndex with normal index
	    
	    int[] arr = {1,2,3,4,5};
	    int max = arr.length - 1;
	    Random rand = new Random();
	    
	    System.out.println(Arrays.toString(arr));
	    
	    for(int i = 0; i < arr.length; i++){
	        int randomIndex = rand.nextInt(max);
	        int temp = arr[i];
	        arr[i] = arr[randomIndex];
	        arr[randomIndex] = temp;
	    }
	    
	    System.out.println(Arrays.toString(arr));
	}
}
