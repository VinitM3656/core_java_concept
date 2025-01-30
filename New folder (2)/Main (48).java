/******************************************************************************

Dynamic Memory Dispatch or Run-time polymorphism

*******************************************************************************/
class Main extends Employee{
    

    @Override
    void setSalary(){
        System.out.println("Salary for 3 Days : "+(bal * 3));
    }

    public static void main(String[] args){
        Employee m1 = new Main(); // This is ignored by the JVM at runtime it assumes its same as new Main()
        m1.setEmployee(27,"Samir",34000);
        m1.getBal();
        m1.getEmployee();
        m1.setSalary();

        // Main e1 = new Employee(); //Not possible
    }
}

// Why it is run-time polymorphism ?
// - JVM is handling this upcasting (i.e. It is hapening at run time. So, its run time polymorphism (OVERRIDING))
// - If no overriding is hapening then its not the polymorphism. In this case it would be just upcasting.
// - upcasting means assigning parent class's object to child class (Employee m1 = new Main()) Its actually nothing but Main() obj. Yes! JVM Ignores Employee actually.

// Important things to notice :
// - upcasting can be done only from parent to child & not vice versa. (I have tried it)
// - even, upcasting from parent to child is possible if inheritance is happening (of course from parent to child)

// IMP :
// Here Employee m1 cannot access child members or methods. It can only allow Parent methods & overriden Parent to Child methods. CHILD SPECIFIC Cannot be accessed!!!