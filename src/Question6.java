import java util.*;
public class Question6
{
    public static void main(string args[])
    {
        int mon, days;
        int ch;
        double tariff;
        float rent;
        Scanner in = new Scanner (system.in);
        system.out.println("enter the choice");
        ch=in.nextInt();
        switch(ch)
        {
            case1:
                system.out.println("enter the no, of months, room rent, and num of days stayed");
                mon=in.nextInt();
                rent=in.nextFloat();
                days=in.nextInt();
                tariff=in.nextDouble();
                tariff=mon*rent*days;
                break;
                case2:
                system.out.println("enter the no, of months, room rent, and num of days stayed");
            mon=in.nextInt();
            rent=in.nextFloat();
            days=in.nextInt();
            tariff=in.nextDouble();
            if(mon=4,5,6)
                tariff=mon*rent*days*2.0/100.0;
            break;
            case3:
            system.out.println("enter the no, of months, room rent, and num of days stayed");
            mon=in.nextInt();
            rent=in.nextFloat();
            days=in.nextInt();
            tariff=in.nextDouble();
            if(mon=11,12)
                tariff=mon*days*rent*20.0/100.0
                        break;
            case4:
            system.out.println("default choice");
        }
    }
}
