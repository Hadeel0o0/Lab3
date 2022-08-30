import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int n1= in.nextInt();
        int n2= in.nextInt();
        int n3= in.nextInt();
        if (n1>n2 & n2>n3)
            System.out.println("increasing");
        else if (n1<n2 & n2<n3)
            System.out.println("decreasing");
        else
            System.out.println("neither");
    }
}
