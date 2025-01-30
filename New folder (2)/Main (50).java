/******************************************************************************

Polymorphism : the ability to take more than one form

compile time allocation : static [Fix] : Here polymorphism is checked at compile time hence it is Static Polymorphism
run time allocation     : dynamic 

*******************************************************************************/

// METHOD OVERLOADING : 

// public class Main
// {
//     void sum(){
//         System.out.println("1. ");
//     }
    
//     void sum(int a){
//         System.out.println("2. a : "+a);    
//     }
    
//     void sum(int a, int b){
//         System.out.println("3. a : "+a+" b : "+b);
//     }
    
//     void sum(int a, String s){
//         System.out.println("4. a : "+a+" s : "+s);
//     }
    
// 	public static void main(String[] args) {
// 		Main m = new Main();
// 		m.sum(); // simple method (same name)
// 		m.sum(10); // method with 1 argument (same name)
// 		m.sum(10,20); // method with 2 argument (same name)
// 		m.sum(10,"Sammmir"); // method with 2 arguments but different data types (same name)
// 	}
// }

// METHOD OVERWRITING : (NOT POSSIBLE WITHIN THE SAME CLASS)

public class Main
{
    void sum(int a, int b){
        System.out.println("3. a : "+a+" b : "+b);
    }
    
    @Override  // overriding within the class is not possible. It is possible from a superclass (Inheritance)
    void sum(int a, int b){
        System.out.println("3. a : "+a+" b : "+b+" End of Ovrriding");
    }
    
	public static void main(String[] args) {
		Main m = new Main();
		
	}
}

// METHOD OVERWRITING : (Possible from Super Class)

Declare a super class A

extend Main with super class A

Now, copy the method from super class A to Main method

Change the content or leave as it to test. You should use @Override keyword before the method. 

This is how you can override.

[No changes were made to Super class]

//Refer to inheritance from prevous example
