import java.util.Scanner;
public class factorial {
    
    public static void main(String ar[])
    {
        int x,fact=1,i;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Number : ");
            x=sc.nextInt();
        }
        
        for (i=x;i>1;i--)
        {
            fact*=i;
        }
        System.out.println("The Factorial of the Given Number is : "+fact);
    }
}
