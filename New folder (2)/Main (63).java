/******************************************************************************

a.length is number of rows
a[0].length is number of columns of row 0

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a [][] = {
		    {1,2,3},
		    {4,5,6,7},
		    {8}
		};
		
		System.out.println("a.length = "+a.length+"\n");
		for(int i = 0; i < a.length; i++){
		    for(int j = 0; j < a[i].length; j++){
		        System.out.print("("+a[i][j]+") ");
		        System.out.println("a["+i+"].length = "+a[i].length);
		    }
		    System.out.println();
		}
	}
}
