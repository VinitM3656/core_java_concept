/******************************************************************************

5. Fibonacci Series using recursion

*******************************************************************************/

public class Main
{
    public static void fab(int old, int neww, int stop){
        
        if(old >= stop){
            System.exit(0);
        }
        
        System.out.println(old);
        
        neww = neww + old;
        old = neww - old;
        
        fab(old, neww, stop);
    }
    
	public static void main(String[] args) {
        fab(0,1,55);    
	}
}
