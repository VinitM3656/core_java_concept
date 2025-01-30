/******************************************************************************

Java Implementation for Finding Prime Numbers between 1 and N

*******************************************************************************/
public class Main
{
    public static boolean prime(int no){
		for(int i = 2; i <= 9; i++){
		    if(i == no){
		        continue;
		    }
		    else if(no%i==0 || no == 1){
		        return false;
		    }
		}
		return true;
    }
    
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++){
		    if(prime(i)){
		        System.out.print(i+", ");
		    }
		}
	}
}

