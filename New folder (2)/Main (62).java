/******************************************************************************

Finding biggest & smallest in array

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] a = {23,66,12,98,45};
		
		int big = a[0];
		int small = a[0];
		
		for(int i : a){
		    if(i > big){
		        big = i;
		    }
		    else if(i < small){
		        small = i;
		    }
		}
		
		System.out.println("Biggest : "+big);
		System.out.println("Smallest : "+small);
	}
}

