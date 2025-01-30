/******************************************************************************

Q4. Why Java is not 100% Object-oriented?

*******************************************************************************/

Java uses 8 primitive data types i.e.

boolean
byte
char
int
float
double
long
short

These are not actual objects. If we use Object form of these data types we can say java is 100% OO.

Boolean b = new Boolean();
Integer i = new Integer();

Exmaple :

public class Main
{
	public static void main(String[] args) {
	   // int i = 20;
	    Integer i = new Integer(20);
		System.out.println(i);
	}
}
