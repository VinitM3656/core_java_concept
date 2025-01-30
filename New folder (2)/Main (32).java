/******************************************************************************

synchronization in java

to use synchronization one must use threading.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		
		Thread t1 = new Thread(){
		    public void run(){
		        a.add();
		    }
		};
		
		Thread t2 = new Thread(){
		    public void run(){
		        a.update();
		    }
		};
		
		t1.start();
		t2.start();
		
//         INPUT : 
// 		a.display();
// 		a.update();
// 		a.add();
		
// 		OUTPUT :
//         Display ~ a : 10, b : 20
//         Update  ~ a : 20, b : 40
//         Add     ~ 20 + 40 is : 60

        
	}
}

