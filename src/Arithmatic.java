import java.util.Scanner;

public class Arithmatic { // + - * / %


    public void add()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println("Addition = " + result);
    }

    public int sub(int a , int b)
    {
        return (a-b);
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Arithmatic obj = new Arithmatic();
        // obj.add();

        System.out.println("Enter any two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        // int result = ;
        System.out.println("Subtraction = " + obj.sub(num1,num2));
        System.out.println("Enter any two numbers");
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        int result= num1*num2;
        System.out.println("Multiplication =" + result);
        System.out.println("Enter any two numbers");
        int num5= sc.nextInt();
        int num6= sc.nextInt();
        int result1= num1/num2;
        System.out.println("Divide =" + result1);
    }
}
