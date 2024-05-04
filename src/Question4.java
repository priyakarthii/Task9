import java.util.*;
public class Question4 {
    public static void main(string[] args) {
        int rows, i, j;
        Scanner sc = new scanner(system.in);
        system.out.println("enter the value:");
        rows = sc.nextInt();
        for (i = rows - 2; i >= 1; i--) {
            for (j = i; j < rows; j++) {
                system.out.println(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    system.out.println(" * ");
                }
            }
            system.out.println("");
        }
        for (i = 2; i <= rows - 2; i++) {
            for (j = i; j < rows; j++) {
                system.out.println(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    system.out.println(" * ");
                }
            }
            system.out.println("");
        }


    }
}