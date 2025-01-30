/******************************************************************************

Inheritance

*******************************************************************************/

// 1) Single Inheritance : A -----> B :
//     // A is the super class of B
//     // B is the child class of A
    
// 2) Multilevel Inheritance : A ------> B -------> C :
//     // C is child of B
//     // B is child of A
    
//     // A is super class

// 3) Hierarchical Inheritance : A -------> B
//                               |
//                               |
//                               |--------> C

// 4) Multiple Inheritance : A --------
//                                   |
//                                   |--------> C
//                                   |
//                           B --------
                          
// 5) Hybrid Inheritance :   A --------
//                                   |
//                                   |--------> C ---------> D
//                                   |
//                           B --------


class Main extends Employee{
    

    @Override
    void setSalary(){
        System.out.println("Salary for 3 Days : "+(bal * 3));
    }

    public static void main(String[] args){
        Main m1 = new Main();
        m1.setEmployee(27,"Samir",34000);
        m1.getBal();
        m1.getEmployee();
        m1.setSalary();

        Employee e1 = new Employee();
        e1.setEmployee(27,"Samir",34000);
        e1.setSalary();
    }
}