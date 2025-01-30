/******************************************************************************

4. Java program to check if the given number is Prime?

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int no = 3;
        boolean flag = true;
		for(int i = 2; i <= 9; i++){
		    if(i == no){
		        continue;
		    }
		    else if(no%i==0 || no == 1){
		        flag = false;
		        break;
		    }
		}
		if(flag)
		    System.out.println(no+" is Primeeee");
		else    
		    System.out.println(no+" is NOOOT Prime");
	}
}


// Loop of Prime Number : 

// public class Main
// {
// 	public static void main(String[] args) {
//         for(int no = 0; no <= 20; no++){
//             boolean flag = true;
//     		for(int i = 2; i <= 9; i++){
//     		    if(i == no){
//     		        continue;
//     		    }
//     		    else if(no%i==0 || no == 1){
//     		        flag = false;
//     		        break;
//     		    }
//     		}
//     		if(flag)
//     		    System.out.println(no+" is Primeeee");
//     		else    
//     		    System.out.println(no+" is NOOOT Prime");
//             }
// 	}
// }
