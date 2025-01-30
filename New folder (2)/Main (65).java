/******************************************************************************

Finding the sqrt of n

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    double n = 15.0;
		double X = n/2; //or n is also okay (n/2 reduces 1 loop)
		double prevX;
		do{
		    prevX = X;
		    X = (prevX + (n/prevX))/2;
		}while(prevX != X); //performing the operation while prevX != X
		
		System.out.println("Square Root of "+n+" is : "+X);
	}
}


//More Easy Logic
//      double num = 16;
// 		double temp = n;
		
// 		for(int i = 0; i <10; i++){
// 		    temp = (temp + n/temp)/2;
// 		}
