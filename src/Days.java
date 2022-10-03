import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter days");
        int days = sc.nextInt();
        int months = days/12;
        months=days/30;
        days=(days%365)%7;
        System.out.println("number of months is:" +months);
        System.out.println("number of days is:" +days);
    }
}
