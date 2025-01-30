/******************************************************************************

Multiple Inheritance
 - Multiple Inheritance is pussible not by class but by interfaces
 - class are not allowed becuase 2 super class will send thier suber class i.e. Object methods & members & will create duplicacy.
 - remember the diamond shape
 
                    O
                    |
                    |
            ----------------
            |              |
            |              |
            A              B
            |              |
            |              |
            ---------------
                    |
                    |
                    C

*******************************************************************************/
interface A{
    void print(); // public abstract void print()
}

interface B{
    void print2(); // public abstract void print2()
}

class Main implements A, B{ // here we have done the multiple inheritance (class Main extends A, B NOT POSSIBLE)
    
    public void print(){ // implementing print() public is must
        System.out.println("Interface A");
    }
    
    public void print2(){ // implementing print2() public is must
        System.out.println("Interface B");
    }
    
    public static void main(String[] args){
        // Main m = new Main();
        // m.print();
        // m.print2();
        
        //OR
        
        A m = new Main(); // only methods from A are allowed
        m.print();
        
        B m2 = new Main(); // only methods from B are allowed [NO Child class method is allowed to call]
        m2.print2();
    }
}

