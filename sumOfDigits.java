import java.util.Scanner;
public class sumOfDigits {
    
    public static void main(String ar[])
    {
        int x,i,sum=0,y;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the Value : ");
            x=sc.nextInt();
        }
        y=x;
        i=y%10;
    
        while(y!=0)
        {
            y/=10;
            sum+=i;
            i=y%10;
            
        }
        System.out.println("The Sum of the digits of "+x+" is : "+sum);

        
    }
}
