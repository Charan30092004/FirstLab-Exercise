import java.util.Scanner;
public class swap
{
    public static void main(String ar[])
    {
        int a,b;
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the Value of A : ");
            a=sc.nextInt();
            System.out.print("Enter the Value of B : ");
            b=sc.nextInt();

        }
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("The Value of A is :"+ a );
            System.out.println("The Value of B is : "+ b);
    }

}