// 11. Write a program to reverse the order of words in a given string. For example, if the input is "Hello World", the output should be "World Hello".
import java.util.Scanner;
public class reverseString 
{
    public static void main(String a[])
    {
        String str;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter the String : ");
            str=sc.nextLine();
        }
        String s[]=str.split(" ");
        int n=s.length;
        // System.out.println(n);
        // System.out.println(str);
        String b="";
        for(n-=1;n>=0;n--)
        {
            b+=s[n];
            b+=" ";
        }
        System.out.println(b);
    }
}