/******************************************************************************

Thread methods

*******************************************************************************/
class myThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

public class Main
{
	public static void main(String[] args) {
		myThread m = new myThread();
		m.start(); // Thread[Thread_Name, Thread_Priority, Thread_Origin]
		m.setName("My Original Thread from Name"); 
		m.setPriority(1);
		System.out.println(m.isAlive()); // it will print at top
	}
}
