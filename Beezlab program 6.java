/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static int findAngleOfClock(int hour, int min)
	{
		int val=(int)((hour*60+min)*0.5);
        int angle=(min*6)-val;
        if (angle<0) 
           angle=-angle;
        return Math.min(360-angle,angle);
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String[] arr=sc.nextLine().split(":");
		int hour = Integer.valueOf(arr[0]),min=Integer.valueOf(arr[1]);
		if(min==30)
		System.out.print("90 degrees");
		else if(min==0)
		System.out.print("180 degrees");
		else
		System.out.print(findAngleOfClock(hour, min)+" degrees");
	}
} //program 6