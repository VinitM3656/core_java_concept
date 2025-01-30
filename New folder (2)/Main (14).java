/******************************************************************************

7. Palindrome Check

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n = 121;
		int rev = 0;
		int temp = n;
		
		while(n != 0){
		    int last = n % 10;
		    rev = rev * 10 + last;
		    n /= 10;
		}
		
		if(temp == rev)
		    System.out.println("Palindrome");
		else
		    System.out.println("NOT Palindrome");
	}
}

