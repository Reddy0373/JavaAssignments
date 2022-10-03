import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age=sc.nextInt();
        if (age >= 18)
        System.out.println("Eligible for Voting!");
        else
        System.out.println("Not Eligible for Voting!");
    }
}
