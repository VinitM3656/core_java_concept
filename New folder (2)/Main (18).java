/******************************************************************************

8. How to remove Whitespaces from String

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s = "I am from Kolhapur";
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : arr){
		    if(c != ' '){
		        sb.append(c);
		    }
		}
		s = sb.toString();
		System.out.println(s);
	}
}

