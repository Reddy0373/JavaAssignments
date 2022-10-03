import java.util.Scanner;

public class Proj2 {
    double pi=3.14;
    Scanner sc=new Scanner(System.in);
    public void circle()
    {
        System.out.println("Enter radius");
        int r=sc.nextInt();
        double res=pi*(r*r);
        System.out.println("Area of Circle ="+res);
    }
    public void square()
    {
        System.out.println("Enter two number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=num1*num2;
        System.out.println("Area of square=" +res);
    }
    public void triangle(){
        System.out.println("Enter base value");
        int base=sc.nextInt();
        System.out.println("Enter height valve");
        int height=sc.nextInt();
        int result=base*height/2;
        System.out.println("Area of Right angle ="+result);
    }

    public static void main(String[] args) {
        Proj2 pr=new Proj2();
        pr.circle();
        pr.square();
        pr.triangle();
    }
}
