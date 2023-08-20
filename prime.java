import java.util.Scanner;
public class prime
{
    public static void main(String ar[])
    {
        int x,i,count=0;
        try(Scanner sc =new Scanner(System.in))
        {
            System.out.print("Enter the Number : ");
            x=sc.nextInt();
        }
        for (i=2;i<x;i++)
        {
            if(x%i==0)
                count++;
        }
        if(count!=0)
            System.out.println("The Given Number is not Prime ");
        else
            System.out.println("The Given Number is Prime ");
    }
}