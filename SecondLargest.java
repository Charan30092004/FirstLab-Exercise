import java.util.Scanner;
public class SecondLargest {

    public static void main(String ar[])
    {
        int n,a[];
        int m1=0,m2=0,i;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Number of Elements in the Array : ");
            n=sc.nextInt();
            a= new int[n];
            for (i=0;i<n;i++)
            {
                System.out.print("Enter the "+(i+1)+" Element : ");
                // System.out.println("M1 : "+m1+"  M2 :"+m2);
                a[i]=sc.nextInt();
                if(i==0)
                {
                    m1=a[i];
                    m2=a[i];
                }
                else
                {
                    if(a[i]>m1)
                        {
                            m2=m1;
                            m1=a[i];
                        }
                    else if(a[i]>m2)
                        m2=a[i];
                }
               
            }
        }
        System.out.println("The Second Largest Number in an Array is : "+m2);
    }
    
}
