import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year that want check:");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy100 = year % 100 == 0;
        if (isDivisibleBy100) {
            boolean isDivisibleBy400 = year % 400 == 0;
            if (isDivisibleBy400) isLeapYear = true;
        } else {
            boolean isDivisibleBy4 = year % 4 == 0;
            if (isDivisibleBy4) isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
