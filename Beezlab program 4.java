/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {  
 public static void main(String args[]) {  
  Scanner in=new Scanner(System.in);
  int N=in.nextInt();
  int count=0;
  for(int i=1;i<=N;i++)
  {
    String r=String.valueOf(i);
    char c[]=r.toCharArray();
    for(Character q:c)
    {
        if(q=='1')
        {
            count++;
        }
    }
  }
  System.out.print(count);
 }  
} //Program 4 find out the no 1's present in the given range