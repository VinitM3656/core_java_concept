/******************************************************************************

Strings in Java

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    //String extends from object class & interfaces also i.e. it is best example of multiple inheritance
		String s1 = "Samir";
		String s2 = "Samir";
		String s3 = "Samir";
		
		// Proving that String with Same content has same hascode. It is stored inside the One location
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//String has overridden toString() method
		System.out.println(s3.toString()); // it return the Actual String
		
		//equals() method also overridden as now it performs Strings are equal or not ??
		System.out.println(s1.equals(s2));
		
		s1 = "new Samir"; // here Java cannot modify string object s1 as it is final. But here Java creates new objects 
		System.out.println(s1); 
		
	}
}

