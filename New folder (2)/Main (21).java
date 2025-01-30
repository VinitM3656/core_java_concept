/******************************************************************************

Q3. Why Java is platform independent?

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

Every java program is executed by JVM i.e. Java Virtual Machine.
JVM creates the .class file (called as byte codes) that can be executed by any operating system.
This is why Java is platform independent.

Still to execute this byte code JVM has specific configuration for different operating systems.
this proves that JVM is platform dependent.
