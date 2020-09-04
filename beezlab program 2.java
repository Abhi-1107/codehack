/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   List<Integer> l=new ArrayList<>();
	   for(int i=0;i<n;i++)
	   {
	       l.add(sc.nextInt());
	   }
	    Collections.sort(l);
	   int max=l.get(l.size()-1);
	   for(int i=1;i<=max;i++)
	   {
	       if(!l.contains(i))
	       {
	           System.out.print(i);
	           return;
	       }
	   }
	}
}//find the misssing numbers