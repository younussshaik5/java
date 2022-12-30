import java.util.Scanner;
class PizzaOrder{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("enter the customer name: ");
        String customerName = user.nextLine();
        System.out.println("enter the customer mail: ");
        String customerEmail=user.nextLine();
        System.out.println("enter the customer Address: ");
        String address= user.nextLine();
        System.out.println("enter the customer number: ");
        long phoneNo= user.nextLong();
        float pizzaPrice=12.5f;
        float garlicBreadPrice=5.99f;
        float beveragePrice=1.99f;
        System.out.println("--------------------------------------------------");
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer email: "+customerEmail);
        System.out.println("Customer Phone no: "+phoneNo);
        System.out.println("Customer Address: "+address);
        System.out.println("--------------------------------------------------");
        System.out.printf("%3s %17s \n","sr. no.","Item category");
        System.out.println("--------------------");
        System.out.printf("%3d %17s \n",1,"Pizza");
        System.out.printf("%3d %17s \n",2,"Garlic Bread");
        System.out.printf("%3d %17s \n",3,"Beverages");
        System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
        int option= user.nextInt();
        switch(option){
            case 1:{
                System.out.println("How many pizza's ?: ");
                int count= user.nextInt();
                float totalPizzaPrice=pizzaPrice*count;
                System.out.println("your total Pizza Bill: $"+totalPizzaPrice);
                break;
            }
            case 2:{
                System.out.println("How many garlic breads ?: ");
                int count= user.nextInt();
                float totalGarlicBreadPrice=garlicBreadPrice*count;
                System.out.println("your total Garlic Bread Bill: $"+totalGarlicBreadPrice);
                break;
            }
            case 3:{
                System.out.println("How many beverages?: ");
                int count= user.nextInt();
                float totalBeveragesPrice=beveragePrice*count;
                System.out.println("your total Beverages Bill: $"+totalBeveragesPrice);
                break;
            }
        }
    }
}