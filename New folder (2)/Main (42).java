/******************************************************************************

Constructor Chaining

*******************************************************************************/
class Parent{
    Parent(){
        System.out.println("This is parent Constructor"); // It is by default invoked if we directly call Child Classes Constructor
    }
    
    Parent(int a){ // this is not default Constructor. its parameterized Constructor. So, we need to use Super() to invoke this.
        this(); // if we want to call same class another Constructor we use this(). It behaves as Parent()
        System.out.println("This is parent Constructor with 1 parameter");
    }
}

public class Main extends Parent
{
    Main(){
        System.out.println("This is child Constructor"); // Even if you overwrite this child Constructor, It will call parent Constructor
    }
    
    Main(int a){
        // super(); // this will call default Constructor.
        super(a); // this will call parameterized Constructor.
        System.out.println("This is child Constructor with 1 parameter");
    }
    
	public static void main(String[] args) {
		Main m = new Main();
		Main m1 = new Main(1);
	}
}

// this() & super() cannot be used at the same time as they compute for 1st position.
// even if we use them indivisually we must call them at 1st position.
