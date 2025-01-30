// /******************************************************************************

// static nested class

// I don't feel this is going to help. Just Study this more to be cleared.

// *******************************************************************************/

// class Outer{
//     static class Inner{  
//         void print(){
//             System.out.println("Outer.Inner.print()");
//         }
//     }
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 		Outer.Inner i1 = new Outer.Inner(); // here static main() can access Outer.Inner directly as it is static
// 		// but cannot access print() beacuase it is not static. to do so, we need object.
// 		i1.print(); // here we have created an instance to access instance varivales (heap memeory)
// 	}
// }



//SECOND CASE :


/******************************************************************************

static nested class

I don't feel this is going to help. Just Study this more to be cleared.

*******************************************************************************/

class Outer2{
    static class Inner2{
        static void print(){
            System.out.println("Outer.Inner.print()");
        }
    }
}

public class Main
{
	public static void main(String[] args) {
        Outer2.Inner2.print(); // here we can access print() without using object because Inner2 class is static & print() method is also static
	}
}


// IMP : Why we are accessing outer directly ? because we are performing operations in that class. our Main() in inside Outer. Its easy. Don't make it complicated

