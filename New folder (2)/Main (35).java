/******************************************************************************


Whole threading is based upon CPU mila ya nahi.

If one thread gets the CPU, it will execute & then after other threads will execute

*******************************************************************************/

// class MyClass implements Runnable{
//     public void run(){
//         for(int i = 0; i < 10; i++){
//             System.out.println("Capital : "+(char)(i+65));
//         }
//     }
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 		Thread t = new Thread(new MyClass());
// 		t.start();
		
// 		for(int i = 0; i < 10; i++){
//             System.out.println("Small   : "+(char)(i+97));
//         }
		
// 	}
// }

// Here any thread will be executed by CPU Thread Handler. There is no sequence.
// But if we use sleep method we can make it in sequence, as threads will get proper time to execute & stop and will not interfare in each other.

class MyClass implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Capital : "+(char)(i+65));
            
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){};
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Thread t = new Thread(new MyClass());
		t.start();
		
		for(int i = 0; i < 10; i++){
            System.out.println("Small   : "+(char)(i+97));
            
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){};
        }
		
	}
}
