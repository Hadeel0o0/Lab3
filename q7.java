import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        System.out.println("enter the number of month");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("31 days"); break;
            case 2:
                System.out.println("28 days"); break;
            case 3:
                System.out.println("31 days "); break;
            case 4:
                System.out.println("30 days"); break;
            case 5:
                System.out.println(" 31 days"); break;
            case 6:
                System.out.println("30  days"); break;
            case 7:
                System.out.println("31  days"); break;
            case 8:
                System.out.println(" 31days"); break;
            case 9:
                System.out.println(" 30 days"); break;
            case 10:
                System.out.println("31  days "); break;
            case 11:
                System.out.println("30   days"); break;
            case 12:
                System.out.println(" 31 days "); break;

        }
    }
}
