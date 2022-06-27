/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
 // method to find factorial of given number
 static int factorial(int n)
 {
  if (n == 0)
  return 1;
   
  return n*factorial(n-1);
 }
  
 // Driver method
 public static void main(String[] args)
 {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  num=sc.nextInt();
  System.out.println("Factorial of "+ num + " is " + factorial(num));
 }
}
