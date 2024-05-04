import java.util.*
public class Question7
{
    public static void main(string args[])
    {
        int a, b, c;
        int x, y, z;
        Scanner in = new Scanner(system.in);
        system.out.println("enter the values of a,b,c");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        x=a+b;
        y=b+c;
        z=a+c;
        if(x>y)
            system.out.println("sum of a, b is greater");
        else if(y>z)
            system.out.println("sum of b,c is greater");
        else
            system.out.println("sum of a, c is greater");
    }

}
