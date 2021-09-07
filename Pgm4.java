import java.util.Scanner;
 class Pgm4
{
    public static void main(String[] args) 
    {
        int n, x, p=0, i = 0,q=0,r=0,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subjects:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the answers:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
    
      int[] s1 = {1,0,1,1,0};
     int[] s2 = {1,0,1,0,0};
    int[] s3 = {1,1,1,1,0};
        for(i = 0; i < n; i++)
        {
           for(j=0;j<5;j++)
           {

            if(a[i] == s1[j])
            {
                p+=a[i];
            }
     
             if(a[i] == s2[j])
            {
                q+=a[i];
            }
       
          if(a[i] == s3[j])
            {
                r+=a[i];
            }
         }
    }
        System.out.println("Total mark of student 1:"+p);
       System.out.println("Total mark of student 2:"+q);
      System.out.println("Total mark of student 3:"+r);
    }
}