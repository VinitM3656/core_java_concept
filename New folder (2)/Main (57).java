/******************************************************************************

Java for Each Loop

*******************************************************************************/
class Main{
    public static void main (String[ ] args ) {
        int[] marks = {89, 78, 84, 97, 87, 92, 91, 81};
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E' , 'I', 'O', 'U' };
        String[] cities = {"New Delhi", "Kolkata", "Mumbai", "Chennai", "Bangaluru", "Hyderabad"};
        
        for(int i : marks){
            System.out.print(" "+i);
        }
        
        for(char i : vowels){
            System.out.print(" "+i);
        }
        
        for(String i : cities){
            System.out.print(" "+i);
        }
    }
}
