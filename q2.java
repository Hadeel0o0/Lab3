import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= in.nextInt();
        if( num == 0)
            System.out.println("Zero");
        else
        if( num > 0)
            System.out.println("positiv");
        if( num < 0)
            System.out.println("Negitiv");
    }
}
