/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] intArr = {1, 2, 5, 12, 7, 3, 8};
    System.out.print("Enter Element to be deleted : ");
    int elem = in.nextInt();
    
    for(int i = 0; i < intArr.length; i++){
      if(intArr[i] == elem){
        // shifting elements
        for(int j = i; j < intArr.length - 1; j++){
            intArr[j] = intArr[j+1];
        }
        break;
      }
    }
      
    System.out.println("Elements -- " );
    for(int i = 0; i < intArr.length; i++){
      System.out.print(" " + intArr[i]);
    }                
  }
}

