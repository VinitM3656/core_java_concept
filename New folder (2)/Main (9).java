/******************************************************************************

3. Java Program to check if a vowel is present in the string?

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s = "dd";
		
		char[] charArray = s.toCharArray();
		
		boolean flag = false;
		
		for(char c : charArray){
		    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		       c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		       flag = true;
		}
		
		if(flag)
		    System.out.println("Present");
		else
		    System.out.println("Not Present");
	}
}

