import java.util.Scanner;
class sample
{
     public boolean armstrong(int a)
        {
            int n=(int)Math.log10(a)+1;
            int b=a;
            int sum=0,r;
            while (b!=0)
            {
                r=b%10;
                b/=10;
                sum+=Math.pow(r,n);
            }
            return a==sum;
        }
}
public class armstrongNumber {
   
    public static void main(String a[])
    {
        int x;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Number : ");
            x=sc.nextInt();
        }
        sample n=new sample();
        if(n.armstrong(x))
        System.out.println("The Given Number is Armstrong");
        else
        System.out.println("The Given Number is not Armstrong");
    }
}
