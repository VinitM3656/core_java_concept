/******************************************************************************

Super()

We cannot inherite the super class Constrcutor (super Constrcutor) BUT we can invoke it using super();

*******************************************************************************/
class Main extends Employee{
    
    // Main(){
    //     super(); // we have invoked Employee Constrcutor
    //     System.out.println("This is Main Constrcutor"); 
    // }
    
    // IF NO CONSTRUCTOR IS DEFINED THEN SUPER CONSTRUCTOR GETS EXECUTED

    public static void main(String[] args){
        new Main();
    }
}

// Important :
// - this() & super() can be at the same time. THey both compete for 1st place
// - so, super() must be at 1st position always
// - without inheritance it is not possible.
// - default constructors are invoked if no Constrcutor is defined.
// (IMP) let say Main() has default Constrcutor (i.e. no Constrcutor is defined) then automatically Employee Constrcutor() is invoked. super() is predefined in default constrcutor.
