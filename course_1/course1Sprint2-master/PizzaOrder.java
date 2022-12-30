public class PizzaOrder {
    public static void main(String[] args) {
        //------task-1
        String customerName="Gary";
        String customerEmail="gary@123.com";
        long phoneNo=412312345;
        String address="20,marbledrive, eville";
        int noOfPizzaOrdered=5;
        float pizzaPrice=12.5f;
        char pizzaSize='M';
        int noOfGarlicBreadOrdered=3;
        float garlicBreadPrice=5.99f;
        int noOfBeveragesOrdered=3;
        float beveragePrice=1.99f;
        //------task-2(total price of pizza's ordered in float) and print
        float garyTotalPizzaPrice=(noOfPizzaOrdered*pizzaPrice);
        //System.out.println("total pizza price: "+garyTotalPizzaPrice);
        float garyTotalGarlicBreadPrice=(noOfGarlicBreadOrdered*garlicBreadPrice);
        //System.out.println("total garlic bread price: "+garyTotalGarlicBreadPrice);
        float garyTotalBeveragesPrice=(noOfBeveragesOrdered*beveragePrice);
        //System.out.println("total beverages price: "+garyTotalBeveragesPrice);
        //--------task-3(total bill of all items in float and if total >= 100$ then true else and store it in bool
        float garyTotalPrice=(garyTotalPizzaPrice+garyTotalGarlicBreadPrice+garyTotalBeveragesPrice);
        //System.out.println("Gary's total price is: "+garyTotalPrice);



        //------task-4(10% discount on total , display customer details, items ordered, total bill, discounted bill)
        float discount=(10/garyTotalPrice)*100;
        float discountedFinalPrice=garyTotalPrice-discount;
        System.out.println("-----------------------------------------------------");
        System.out.println("----------------CUSTOMER DETAILS---------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("Customer name: "+customerName);
        System.out.println("Phone number: "+phoneNo);
        System.out.println("Custome Email: "+customerEmail);
        System.out.println("Customer Address: "+address);
        System.out.println("------------------------------------------------------");
        System.out.println("                   Order Summary                      ");
        System.out.println("------------------------------------------------------");
        System.out.printf("%3s %12s %17s %15s %17s \n","sr. no.","Item name","Item Quantity","$Price/Unit","$Total Price");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%3d %12s %17d %15f %17f \n",1,"Pizza",noOfPizzaOrdered,pizzaPrice,garyTotalPizzaPrice);
        System.out.printf("%3d %12s %17d %15f %17f \n",2,"Garlic Bread",noOfGarlicBreadOrdered,garlicBreadPrice,garyTotalGarlicBreadPrice);
        System.out.printf("%3d %12s %17d %15f %17f \n",3,"Beverages",noOfBeveragesOrdered,beveragePrice,garyTotalBeveragesPrice);
        System.out.println("------------------------------------------------------");
        System.out.println("TOTAL BILL OF GARY: $"+garyTotalPrice);
        System.out.println("DISCOUNT: $"+discount);
        System.out.println("FINAL PRICE AFTER DISCOUNT: $"+discountedFinalPrice);
        System.out.println("-------------------THANK YOU--------------------------");
        // in third task, asked to check true or false
        /**
         boolean eligible;
         if(garyTotalPrice>=100){
         eligible=true;
         System.out.println("gary is true");
         }
         else {
         eligible=false;
         System.out.println("gary is false");
         }
         */

    }
}