/******************************************************************************

2. How to swap two numbers without using a third variable ?

Here we can not use functions as java is pass by value. so, values will be swaped internally but when we come out of function those
values will be as it is.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		
		a = a + b; // 20 + 30 = 50
		b = a - b; // 50 - 30 = 20
		a = a - b; // 50 - 20 = 30
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}



