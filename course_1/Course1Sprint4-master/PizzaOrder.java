import java.util.Scanner;
class Pizza{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter the customer name: ");
        String customerName = user.nextLine();
        System.out.println("enter the customer mail: ");
        String customerEmail = user.nextLine();
        System.out.println("enter the customer Address: ");
        String address = user.nextLine();
        System.out.println("enter the customer number: ");
        long phoneNo = user.nextLong();
        float pizzaPrice = 12.5f;
        float garlicBreadPrice = 5.99f;
        float beveragePrice = 1.99f;
        int ask; // setting as default so it exits after one loop unless required to reorder and enter the loop
        float totalPizzaPrice=0;//  to count and add the price for the repeated items
        float totalGarlicBreadPrice =0;//  to count and add the price for the repeated items
        float totalBeveragesPrice=0; //  to count and add the price for the repeated items
        System.out.println("--------------------------------------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer email: " + customerEmail);
        System.out.println("Customer Phone no: " + phoneNo);
        System.out.println("Customer Address: " + address);
        System.out.println("--------------------------------------------------");
        do {
            System.out.printf("%3s %17s \n", "sr. no.", "Item category");
            System.out.println("--------------------");
            //
            System.out.printf("%3d %17s \n", 1, "Pizza");
            System.out.printf("%3d %17s \n", 2, "Garlic Bread");
            System.out.printf("%3d %17s \n", 3, "Beverages");
            System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
            int option = user.nextInt();
            if (option == 1) {
                System.out.println("How many pizza's ?: ");
                int count = user.nextInt();
                totalPizzaPrice = pizzaPrice * count;
                //pizzaCounter=pizzaCounter+totalPizzaPrice;
                //System.out.println("your total Pizza Bill: $" + pizzaCounter);

            } else if (option == 2) {
                System.out.println("How many garlic breads ?: ");
                int count = user.nextInt();
                totalGarlicBreadPrice = garlicBreadPrice * count;
                //garlicBreadCounter=garlicBreadCounter+totalGarlicBreadPrice;
                //System.out.println("your total Garlic Bread Bill: $" + garlicBreadCounter);

            } else if (option == 3) {
                System.out.println("How many beverages?: ");
                int count = user.nextInt();
                totalBeveragesPrice = beveragePrice * count;
                //beveragesCounter=beveragesCounter+totalBeveragesPrice;
                //System.out.println("your total Beverages Bill: $" + beveragesCounter);

            }
            else if (option == 4) {
                System.out.println("enter the options correctly");
                option = user.nextInt();
                System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
            }
            System.out.println("1 to reorder and 0 to exit");
            ask = user.nextInt();
            if(ask!=0 && ask!=1){
                System.out.println("1 to reorder 0 to exit");
                ask= user.nextInt();

            }
        }while(ask==1);
        float totalBill=+totalPizzaPrice+totalGarlicBreadPrice+totalBeveragesPrice;
        System.out.println("The total bill amount is: $"+totalBill);
        if(totalBill>50){
            float discount=totalBill-(10/totalBill)*100;
            System.out.println("The total discounted bill amount : $"+discount);
        }
    }
}