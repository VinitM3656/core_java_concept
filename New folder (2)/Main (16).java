/******************************************************************************

22. How to print date in specific format?

*******************************************************************************/
import java.text.*; // SimpleDateFormat() class
import java.util.*; // Date() class

public class Main{
    public static void main(String[] args){
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyy"); // & for time HH:mm:ss
        String date = obj.format(new Date());
        System.out.println(date);
    }
}
