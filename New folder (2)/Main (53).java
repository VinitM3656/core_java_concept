/******************************************************************************

Abstraction : Car Structure & Car from Outside. Here we are hiding the methods

*******************************************************************************/
// Type I : Partial Abstraction (Can also be used as Fully Abstraction)
abstract class ATM{ // Abstract Class (75% or Partial Abstraction) This is abstract CLASS it cannot be instantiated BUT can be referred
    abstract void checkBal(); // This is abstract METHOD means we need to implement it at child (compulsary)
    abstract void withdraw();
    abstract void deposit();
    // {
    //     System.out.println("abstract method cannot have a body. They are just to make compulsary");
    // }
    public void display(){ // this is not an abstract METHOD so, its just like normal method
        System.out.println("Displaying ATM Details");
    }
}

abstract class ATMFEWIMPLENETED extends ATM{ // I have declared this class as abstract because I just don't want to implement all the abstract methods from my super class i.e. ATM.
// So, now the compulsary is moved towards this classes child class Main
    //Implementation
    
    void checkBal(){
            System.out.println("checkBal");
    }
    
    //You can create new abstract method here also
    
    abstract void newBal();
    
}

class Main extends ATMFEWIMPLENETED{ // here you need to Implement all REMAINING abstract methods from above to abstract classes
    
    void withdraw(){
            System.out.println("withdraw");
    }
    
    void deposit(){
            System.out.println("Deposit");
    }
    
    void newBal(){
        System.out.println("This is an abstract method declared in 2nd class");
    }
    
    @Override // remember if method is public then it must be public or greater while overridding
    public void display(){ // this was a non-abstract method so we can use it directly (BUT I have shown an overridden example also to demonstrate diff between abstract & override)
        System.out.println("This is New Display Overridden!");
    }
    
    public static void main(String[] args){
        Main m = new Main();
        m.checkBal();
        m.deposit();
        m.newBal();
        m.display();
    }
}


// ----------------------------------------------------------------------------------
// Type II : Full Abstraction Only
// interface class ATM{ // Abstract Class (100% or Full Abstraction)
//     abstract void checkBal();
//     abstract void withdraw();
//     abstract void deposit();
// }

// class Bank extends ATM{
//     //Implementation
// }


// IMP :
// - Abstract class is made so that we can only use it as Inheritance & not the object.
// - We cannot create objects (i.e. instances)
// - We can only use it as Super class & use its properties.
// - abstract class can have ZERO abstract methods but still it is abstract


// Compulsory :
// - It is Compulsory to define the abstract methods in child class.


// So, basically abstract is like fixed class. we cannot make copy of it but we need to implement it if we inherite itself.


