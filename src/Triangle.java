import java.util.Scanner;

public class Triangle {
    Scanner sc = new Scanner(System.in);

    void validate()
    {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a<1 || b<1 || c<1)
        {
            System.out.println("Enter Proper values of the Triangle");
        }
        else if(a+b+c==180.0)
        {
            System.out.println("Triangle is Valid!");
        }
        else{
            System.out.println("Triangle is not Valid!");
        }
    }

    public static void main(String[] args) {
        Triangle a = new Triangle();
        a.validate();
    }
}
