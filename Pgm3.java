import java.util.Scanner;

class vehicle
{
int s_capacity=2,mno=214;
void disp()
{
System.out.println("vehicle details\n");
System.out.println("=============\n");
System.out.println("model no:"+mno);
System.out.println("seating capacity="+s_capacity);
}}
class child extends vehicle
{
int cno=25,rno=87;
String str="sreekutty";
String cl="black and blue";
void disp()
{
super.disp();
System.out.println("chasse no no:"+cno);
System.out.println("reg no="+rno);
System.out.println("owner name:"+str);
System.out.println("colour="+cl);
}
}
class Pgm3 {
public static void main(String[] args)
{
child c=new child();
c.disp();
}
}