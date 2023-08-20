import java.util.Scanner;
public class palindrome {
   
    public static void main(String[] args) 
    {
     
    int x,n;
    try(Scanner sc=new Scanner(System.in))
    {
        System.out.print("Enter the Number of Digits : ");
        n=sc.nextInt();
        System.out.print("Enter the Number : ");
        x=sc.nextInt();
    }
    int y,i,j,r=0;
    y=x;
    
    for (i=0;i<n;i++)
    {
        j=y%10;
        y/=10;
        r*=10;
        r+=j;

        // System.out.println(y);
    }
    // System.out.println(y);
    if(r==x)
        System.out.println("True");
    else
        System.out.println("False");
           
    }
    
    
}
