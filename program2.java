/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
		
		System.out.println("Enter the term to be printed");
		Scanner ob = new Scanner(System.in);
		int ch = ob.nextInt();
		System.out.println("The " + ch + " terms of fibanocci numbers are-");
		int a, b, s, n;
		a = b = 1;
		for (n = 1; n <= ch; n++) {
			System.out.println(a);
			s = a + b;
			a = b;
			b = s;
		}
	}
}
