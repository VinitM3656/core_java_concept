/******************************************************************************

5. Fibonacci Series

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int Old = 0;
	    int New = 1;
		for(int i = 1; i < 10; i++){
		    System.out.println(Old);
		    New = New + Old; // 8 = 5 + 3
		    Old = New - Old; // 5 = 8 - 3
		}
	}
}

