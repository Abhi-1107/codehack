/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>  
 int main()    
{    
int a=45, b=98;      
printf("Before swap a=%d b=%d",a,b);      
a=a+b;
b=a-b;
a=a-b;
printf("\nAfter swap a=%d b=%d",a,b);    
return 0;  //3.programm to swap two numbers using thired variable
}