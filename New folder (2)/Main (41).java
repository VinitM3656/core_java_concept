/******************************************************************************

Throw & Custom Exception

*******************************************************************************/
public class Main{
    // we don't need to extends Custom_Exception as default class scope is visible within the same directory to this main class
    public static void main(String[] args) throws Custom_Exception { // if catch block is not handling then we need to throw it
        Person p = new Person(12,"Samir Nayakawadi", 34000);
        
        if(p.getAge() > 18){ // if age is 18+
            System.out.println("Employee Details Are :");
            System.out.println("Age : "+p.getAge());
            System.out.println("Name : "+p.getName());
            System.out.println("Salary : "+p.getSalary());
        }
        else{ // if age is 18-
            throw new Custom_Exception("Age is Not Valid"); // it goes to the class constructor
        }
    }
}