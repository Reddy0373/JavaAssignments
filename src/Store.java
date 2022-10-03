import java.util.Scanner;

public class Store {
    Scanner sc= new Scanner(System.in);
    void Store()
    {
        int i = 1;
        double fa=0.0;
        while (i==1)
        {
            System.out.println("Enter the price of the item: ");
            double price = sc.nextDouble();
            System.out.println("Enter the quantity of the item: ");
            double quantity = sc.nextDouble();
            if(quantity>=10.0){
                fa=fa+(0.90*price*quantity);
            }
            else {
                fa=fa+(price*quantity);
            }
            System.out.println("Do You want add more items: (if yes enter 1 else enter 0)");
            i= sc.nextInt();
        }

        System.out.println("The final Amount of the groceries purchased are: "+fa);
    }

    public static void main(String[] args) {
        Store a = new Store();
        a.Store();
    }
}
