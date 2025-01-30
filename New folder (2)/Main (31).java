/******************************************************************************

Inter Thread Communication

Wait() will send this tread to waiting state...
notify() will notify that now my execution is over & other threads who are waiting can proceed...
notifyAll() will wakes up all the threads those were waiting...

Learn DeadLock
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Account m = new Account();
		
		Thread t1 = new Thread(){
		    public void run(){
		        m.withdraw(10000);
		    }    
		};
		
		Thread t2 = new Thread(){
		    public void run(){
		        m.deposit(2000);
		  }    
		};
		
		t1.start();
		t2.start();
		
	}
}
