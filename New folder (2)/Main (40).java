/******************************************************************************

final, finally(), finalize()

*******************************************************************************/
public class Main
{
    private int s;
    Main(int s){
        this.s = s;
        System.out.println("Main method called number : "+s);
    }
    
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalize Method is Called... number : "+s);
    }
    
	public static void main(String[] args) {
		Main m = new Main(1); // object 1 will execute (not finalize 1)
		m = new Main(2); // object 2 will execute (not finalize 2)
		m = new Main(3); // object 3 will execute (not finalize 3)
		
		
// 		Now, objects will be deleted 3,2,1
		// now finalize 3 will execute to terminate the object 3 (it won't print! WHY I DON'T KNOW!!! Google it)
		// now finalize 2 will execute to terminate the object 2 (it will print)
		// now finalize 1 will execute to terminate the object 1 (it will print)
		
		System.gc();
	}
}


// final = Its the keyword. to make a variable constant

// finally() = Its the method(). this is default for try. It will definitely execute erespective of catch
//           AND it is majorly used to shut down system calls that are invoked during the program.

// finalize() = Its the method(). This method gets called before destroying the object by garbage collector.






