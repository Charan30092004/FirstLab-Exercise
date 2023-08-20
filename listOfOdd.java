import java.util.Scanner;
public class listOfOdd {

    public static void main(String ar[])
    {
        int n,i,test=0;
        int a[];
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Number of Elements in the Array : ");
            n=sc.nextInt();
            a=new int[n];
            for (i=1;i<n+1;i++)
            {
                System.out.print("Enter the "+i+" Element of the Array :");
                a[i-1]=sc.nextInt();
            }
        }
        for (i=0;i<n;i++)
        {
            if(a[i]%2==0)
                {
                System.out.println("N0");
                test++;
                }
        }
        if(test==0)
        System.out.println("Yes");


    }
    

}
