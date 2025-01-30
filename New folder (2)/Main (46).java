/******************************************************************************

Interface

*******************************************************************************/
public class Main implements ATM // extend is replaced with implements
{
    // implementation is required here
    
    public void print(){ //it must be public as it is defined public in interface
     System.out.println("Printed the interface method");
    }
    
    void print2(){
        System.out.println("Printed the Main - Normal Class Method");
    }
    
	public static void main(String[] args) {
// 		Main m = new Main(); (Try this first)
		// we can also retrict to use ATM.java ONLY Methods & not child Main class methods byte
		ATM m = new Main(); // as ATM has print() method only we cannot run print2() (then this second)
		m.print();
// 		m.print2();
	}
}
