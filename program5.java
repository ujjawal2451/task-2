/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
 
public class Main
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter Value of first number : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of second number : ");
        r = scanner.nextInt();
 
        System.out.print("Combination of two numbers is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nPermutation of two numbers is " +(fact(n)/(fact(n-r))));
    }
}
 

