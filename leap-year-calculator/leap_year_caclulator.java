import java.util.Scanner;

public class leap_year_caclulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nam can kiem tra :");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 == 0) {
            System.out.println(year + " : la nam nhuan");
        }
        else {
            System.out.println(year + " : khong la nam nhuan");
        }
    }
}