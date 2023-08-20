import java.util.* ;
public class vowels {

    static boolean checkvowels(char a)
        {
            char v[]={'a','A','e','E','i','I','o','O','u','U'};
            for (char i : v)
            {
                if(a==i)
                return true;
            }
            return false;

        }
    public static void main(String ar[])
    {
        String x;
        try(Scanner sc =new Scanner(System.in))
        {
            System.out.print("Enter the String : ");
            x=sc.nextLine();
        }
        // System.out.print(x.length());
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            if(checkvowels(x.charAt(i)))
            {
                count++;
            }
        }
        System.out.println("The Number of Vowels in the Given String is : "+count);
    }

    
}
