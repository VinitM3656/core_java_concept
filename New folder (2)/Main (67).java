/******************************************************************************

Object Class & Clone() Method

*******************************************************************************/
// Errors to be taken care of -
// java.lang.CloneNotSupportedException (2)
// unreported exception CloneNotSupportedException (3)
// incompatible types: Object cannot be converted to Main (4)

public class Main implements Cloneable //2) implement Cloneable keyword aka marker interface {}
{
    int id;
    String name;
    public Main(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return "ID : "+id+", Name : "+name;
    }
    
	public static void main(String[] args) throws Exception{ //3) handle the Exception
		Main m1 = new Main(86,"Samir");
		System.out.println(m1);
		Main m2 = (Main) m1.clone(); //1) clone method called. 4) type cast to Main because clone() returns Object(SuperClass)
		System.out.println(m2);
	}
}

// m1 is cloned successfully to m2
