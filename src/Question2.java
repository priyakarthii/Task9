import java.util.Scanner;

public class Question2 {
    public static void main(String[] args)
    {
       String a,r="";
        Scanner sc= new scanner(System.in);
        System.out.println("Enter the value");
        a=sc.nextLine();
        for(int i=a.length()-1;i>=0;i--)
        {
            r= r+a.charAt(i);
        }
        System.out.println("The original string "+a);
        System.out.println("The reversed string "+r);

    }
}
