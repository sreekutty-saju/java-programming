import java.util.Scanner;  
class sumofdigits{
public static void main (String args[])
{
int d,s=0;
Scanner sc= new Scanner(System.in);      
System.out.print("Enter number- ");  
int a= sc.nextInt();  
while(a > 0)  
{      
d= a % 10;   
s= s + d;  
a= a/ 10; 
}
System.out.println("sum of digits:"+s);

}

}