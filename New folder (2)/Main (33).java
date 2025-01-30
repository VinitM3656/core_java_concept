/******************************************************************************

Difference between Threading & Synchronization

Threading is useful in running multiple threads at a time. with sequence or without sequence.
Normally when we got an Exception, we need to handle it properly but if we use threading the program continues its execution.
This is useful when 1 things goes wrong but rest 9 thing are working. so, all these 9 threads will run properly.

And 

Synchronization will help when multiple threads are accessing 1 resource hence, this may cause system failure or wrong data updation.
example : Movie Ticket booking. One seat cannot be booked by multiple uses (wrong data updation)

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

