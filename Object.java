public class Object
{  
static int count=0;  
public static void main(String args[])  
{  
Object o1=new Object();   
o1.count();  
Object o2=new Object();  
o2.count();  
Object o3=new Object();   
o3.count();  
Object o4=new Object();   
o4.count();  
System.out.println("Total Number of Objects: "+count);  
}   
static void count()  
{  
count++;  
}  
}