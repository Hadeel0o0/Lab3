import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  number of month:");
        int month = in.nextInt();
        System.out.println("Enter  number of days:");
        int num = in.nextInt();
        String season="nothing";
//////////////////////////////////////////////////
        if (month == 1 || month == 2 || month == 3)
            season = "winter";
        else if (month == 4 || month == 5 || month == 6)
            season = "spring";
        else if (month == 7 || month == 8 || month == 9)
            season = "summer";
        else if (month == 10 || month == 11 || month == 12)
            season = "fall";
//////////////////////////////////////////////////////
        if (month % 3 == 0 & num >= 21) {
            if (season.equals("winter"))
                season = "spring";
            else if (season.equals("spring"))
                season = "summer";
            else if (season.equals("summer"))
                season = "fall";
            else
                season = "winter";
        }

        System.out.println("season is.."+season);
    }
}