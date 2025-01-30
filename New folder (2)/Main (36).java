/******************************************************************************

Threading Exmaple

Best example for use of Threading...Here we use threading to do multiple jobs simultaneously.

*******************************************************************************/
class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 20; i++){
            if(i%2 == 0){
                System.out.println("Even. Number = "+i);
                System.out.println(Thread.currentThread());
            }
            try{
                Thread.sleep(1000); // This loop will go to sleep for 1 seconds after 1st iteration. Then remaining threads will woke up to execute. Here, we have main thread that will execute now.
            }
            catch(Exception e){};
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start(); // here, start() manages the thread & helps to use multithreading
// 		t1.run(); // here, run method will run as normal method
		
		for(int i = 1; i <= 20; i++){
            if(i%2 != 0){
                System.out.println("ODDD. Number = "+i);
                System.out.println(Thread.currentThread());
            }
            // try{
            //     Thread.sleep(1000); // Here, we can see 1st output is 1 ("ODDD" from main thread) BUT, actually 1st execution was from MyThread class but the condition
            // }
            // catch(Exception e){}; // if we comment this. then, MyThread will run 1st & as it sleeps all the Main() method i.e. ODD will execute within 500 miliseconds of time & then EVEN block i.e. MyThread will continue....
        }
		
	}
}
