import java.util.Scanner;
public class fibonacci {
    public static void main(String ar[])
    {
        int n,a[];
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Value of n : ");
            n=sc.nextInt();
        }
        if(n>2)
            a= new int[n];
        else
            a= new int[2];
        a[0]=0;
        a[1]=1;
        System.out.print(a[0]+" "+a[1]+" ");
        for (int i=2; i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    
    }
    
}
