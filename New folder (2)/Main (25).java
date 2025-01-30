/******************************************************************************

Q7. What is singleton class in Java and how can we make a class singleton?

 We can use the Singleton class many times but object will be same as before.
 object is created once & used multiple times.
 
 in normal cases we create new object each time.
 here, we are creating single time.
*******************************************************************************/

class Singleton{
    static Singleton obj = new Singleton(); // private constrcutor has access within the class
    
    private Singleton(){ // giving private access won't allow to access outside of class
        
    }
    
    public static Singleton getSingleton(){ //its the smart way to return obj. Indirectly we are passing obj
        return obj;
    }
}

public class Main
{
	public static void main(String[] args) {
// 		Singleton obj1 = Singleton.getSingleton(); // we have declared everything static so we can directly access it.
        Singleton obj2 = Singleton.obj; //(recommended)

        // obj has declared static because we can direclty access without creating the object [this is the only reason]
        //static means class area

// 		System.out.println(obj1);
		System.out.println(obj2);
	}
}

// https://www.youtube.com/watch?v=KUTqnWswPV4


// Stack Area : Local Variables (All Methods) [Stacks of Stacks]
// Class/ Method Area : static members & methods (but method variables are stored in stack area)
// Heap : Non-static members of Class


