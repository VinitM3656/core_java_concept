/******************************************************************************

importance of toString() & Constructor

*******************************************************************************/
// public class Main
// {
//     int a;
//     String s;

//     public void setter(int a, String s){
//         this.a = a;
//         this.s = s;
//     }
    
//     public String getter(){
//         return "ID : "+a+", Name : "+s;
//     }
    
// 	public static void main(String[] args) {
// 		Main m = new Main();
// 		m.setter(100, "Samir");
// 		String result = m.getter();
// 		System.out.println(result);
// 	}
// }

// Whole above thing can be replaced by below code  -

public class Main{
    
    int a;
    String s;
    
    // setter
    public Main(int a, String s){ //Constructor (Default Input) (Overwritting)
        this.a = a;
        this.s = s;
    }
    
    // getter
    public String toString(){ // toString (Default Output) (Overwritting) 
        return "ID : "+a+", Name : "+s; 
    }
    
    public static void main(String[] args){
        Main m = new Main(100, "Samir"); // passing values to Constructor.
        System.out.println(m); // class returns toString by default. (which we have overwritten)
    }
}

// Note - If we dont define toString() then it will return the hashCode in String form
