/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n = 11;
	    int i = 2;
	    int flag = 0;
	    
	    while(i <= n/2){
	        if(n%i==0){
	            flag = 1;
	            break;
	        }
	        i++;
	    }
	    if(flag == 0){
	        System.out.println("Prime");
	    }
	    else{
	        System.out.println("Not Prime");
	    }
	}
}

