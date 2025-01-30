
// Encapsulation (use Visual Studio)


//Customer.java & Main.java are in same package (because of same folder (we don't need to define package))
public class Main
{
	public static void main(String[] args) {
	    Customer c = new Customer(10,"Samir",34488);
        // System.out.println(c.id); //private
        System.out.println(c.name); //protected
	    System.out.println(c.bal); //public
        System.out.println(c.bank); //default
	}
}

// In Short :

// public    : class | package | subclass | world
// protected : class | package | subclass |  -
// default   : class | package |    -     |  -
// private   : class |   -     |    -     |  -

// https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
// https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in

// I think default is not clear so here is the solution : class |

// public    : class | package | subclass (same package) | subclass (diff package) | world
// protected : class | package | subclass (same package) | subclass (diff package) |   -
// default   : class | package | subclass (same package) |          -              |   -
// private   : class |   -     |           -             |          -              |   -