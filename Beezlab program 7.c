/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
int main()
{
    long a;
    scanf("%ld",&a);
    int temp=a;
    int sum=0;
     while (temp > 0 || sum > 9)  
        { 
            if (temp == 0) { 
                temp = sum; 
                sum = 0; 
            } 
            sum += temp % 10; 
            temp/= 10; 
        } 
    printf("%d",sum);
    

    return 0;
}
//adding digits in a number until it becomes a single digit 