/******************************************************************************

Packages in Java

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

Compiling the packages : 

package cdac;
package cdac.hyd;


javac -d . DAC.java // Creates folder cdac & file dac.java inside it.

-------------------------------
from main 

If you want to access package main must be in package 

package mypack;

import cdac.*;
import cdac.hyd.*;

Compiling main :

javac mypack.Main
java mypack.Main

-------------------------------

We can do this without import. can use FQN.
cdac.hyd.DASSD obj = new cdac.hyd.DASSD();


---------------------------------

all methods must be public for packages.
