    import java.util.Scanner;

    public class PizzaOrder {
        float priceOfRegularPizza=9.99f;
        float priceOfMediumPizza=11.99f;
        float priceOfLargePizza=13.99f;
        float priceOfGarlicBread=5.99f;
        float priceOfBeverage=1.99f;
        // giving as static , cause need to use instance variable inside the static method
        static int pizzaCountCounter=0;
        static int garlicBreadCountCounter=0;
        static int beverageCountCounter=0;
        public void customerDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name of customer");
            String customerName = sc.nextLine();
            System.out.println("Enter email of customer");
            String customerEmail = sc.nextLine();
            System.out.println("Enter address of customer");
            String customerAddress = sc.nextLine();
            System.out.println("Enter phone number of customer");
            Long customerPhoneNo = sc.nextLong();
            System.out.println("------------------------------ \n       Customer Details\n ------------------------------");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Phone Number: " + customerPhoneNo);
            System.out.println("Customer email: " + customerEmail);
            System.out.println("Customer Address: " + customerAddress);
        }
        public void displayMenu(){
            System.out.printf("%3s %17s \n", "Sl no.", "Item Category");
            System.out.println("-----------------------");
            System.out.printf("%3s %17s \n","1)", "Pizza");
            System.out.printf("%19s \n","Price of One Regular Pizza : $"+priceOfRegularPizza);
            System.out.printf("%19s \n","Price of One Medium Pizza : $"+priceOfMediumPizza);
            System.out.printf("%19s \n","Price of One Large Pizza : $"+priceOfLargePizza);
            System.out.printf("%3s %17s \n","2)", "Garlic Bread");
            System.out.printf("%19s \n","Price of One Garlic Bread : $"+priceOfGarlicBread);
            System.out.printf("%3s %17s \n","3)", "Beverages");
            System.out.printf("%19s \n","Price of One Beverage: $"+priceOfBeverage);
        }
        public float getPriceOfPizzaBasedOnSize(int size){
            float priceBasedOnSize=0;
            Scanner askagain=new Scanner(System.in);//used for error condition if entered wrong number
            if(size==1){
                priceBasedOnSize=priceOfRegularPizza;
                //System.out.println("price of Regular: $"+priceBasedOnSize);
            }else if (size==2){
                priceBasedOnSize=priceOfMediumPizza;
                //System.out.println("price of Medium: $"+priceBasedOnSize);

            } else if (size==3) {
                priceBasedOnSize=priceOfLargePizza;
                //System.out.println("price of Large: $"+priceBasedOnSize);

            }else{
                System.out.println("Invalid size, Enter 1,2 or 3");
                priceBasedOnSize=0;
                size= askagain.nextInt();
            }
            return priceBasedOnSize;
        }
        public float getPriceOfGarlicBread(){

            return priceOfGarlicBread;
        }
        public float getPriceOfBeverage(){

            return priceOfBeverage;
        }
        public float calculatePriceOfPizza(int pizzaCount, float pizzaPriceBySize){
            PizzaOrder order=new PizzaOrder();
            float pizzaPriceEvenAfterAddingAll = 0;
            float pizzaPrice = pizzaPriceBySize * pizzaCount;
            if (pizzaPriceBySize==0){
                pizzaCountCounter=0+pizzaCountCounter;// pizzacountcounter will be 0 if size is not in the given range
                pizzaPriceEvenAfterAddingAll=pizzaPriceEvenAfterAddingAll+pizzaPrice;
                System.out.println("your total Pizza Bill: $" + pizzaPriceEvenAfterAddingAll);
                return pizzaPriceEvenAfterAddingAll;
            }
            else{
                pizzaPriceEvenAfterAddingAll=pizzaPriceEvenAfterAddingAll+pizzaPrice;
                pizzaCountCounter=pizzaCount+pizzaCountCounter;
                System.out.println("your total Pizza Bill: $" + pizzaPriceEvenAfterAddingAll);
                return pizzaPriceEvenAfterAddingAll;
            }
        }
        public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBread){
            float garlicBreadPriceEvenAfterAddingAll=0;
            float totalGarlicBreadPrice=priceOfGarlicBread*noOfGarlicBread;
            garlicBreadPriceEvenAfterAddingAll=garlicBreadPriceEvenAfterAddingAll+totalGarlicBreadPrice;
            garlicBreadCountCounter=noOfGarlicBread+garlicBreadCountCounter;
            System.out.println("your total Garlic Bread Bill: $"+garlicBreadPriceEvenAfterAddingAll);
            return garlicBreadPriceEvenAfterAddingAll;//total amount even if order repeated

        }
        public float calculatePriceOfBeverage(int noOfBeverage, float priceOfBeverage){
            float beveragePriceEvenAfterAddingAll=0;
            float totalBeveragePrice=priceOfBeverage*noOfBeverage;
            beveragePriceEvenAfterAddingAll=beveragePriceEvenAfterAddingAll+totalBeveragePrice;
            beverageCountCounter=noOfBeverage+beverageCountCounter;
            System.out.println("your total Beverage Bill: $"+beveragePriceEvenAfterAddingAll);
            return beveragePriceEvenAfterAddingAll;//total amount even if order repeated

        }
        public float calculateTotalBill(float finalPriceOfPizza,float finalPriceOfGarlicBread,float finalPriceOfBeverage){
            float totalAmount=(finalPriceOfPizza+finalPriceOfGarlicBread+finalPriceOfBeverage);
            //System.out.println("your total amount: $" + totalAmount);
            return totalAmount;
        }
        public  float calculateDiscountAndReturnBillAmount(float totalBillAmount){
            if(totalBillAmount>50){
                float discount=totalBillAmount-((10/totalBillAmount)*100);
                return discount;
            }
            return totalBillAmount;
        }
        public void displayOrderDetails(int pizzaCount, int garlicBreadCount, int beverageCount, float totalBill,float totalDiscountedPrice){
            PizzaOrder tot=new PizzaOrder();
            System.out.println("Order Details");
            System.out.println("---------------");
            System.out.println("The number of pizzas ordered          : "+pizzaCount);
            System.out.println("The number of garlic bread ordered    : "+garlicBreadCount);
            System.out.println("The number of beverages ordered       : "+beverageCount);
            System.out.println("------------------------------------------------------------------");
            System.out.println("The Total Bill Amount is              : "+totalBill);
            System.out.println("The Discounted Bill Amount is         : "+totalDiscountedPrice);

        }
        public static void main(String[] args) {
            int ask;
            float totalBillIfRepeated=0;
            Scanner user=new Scanner(System.in);//Scanner class for options to choose the category of item
            PizzaOrder order=new PizzaOrder();
            order.customerDetails();
            order.displayMenu();
            do{
                System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
                int option= user.nextInt();//taking input to choose pizza or bread or beverages
                float finalPriceOfPizza = 0;//will use it for total pizza price
                float finalPriceOfGarlicBread=0;//will use it for total garlicBread price
                float finalPriceOfBeverage=0;//will use it for total beverage price
                int count;
                int size;// to use globally in different loops like pizza size and to give input of size for showing it for order details
                if(option==1){
                    System.out.println("How many pizza's ?: ");
                    count = user.nextInt();
                    System.out.println("enter 1 for regular 2 for medium 3 for large");
                    size=user.nextInt();
                    float finalPizzaPrice=order.getPriceOfPizzaBasedOnSize(size);
                    finalPriceOfPizza=order.calculatePriceOfPizza(count,finalPizzaPrice);

                } else if (option==2) {
                    System.out.println("How many Garlic Bread's ?: ");
                    count = user.nextInt();
                    finalPriceOfGarlicBread=order.calculatePriceOfGarlicBread(count, order.getPriceOfGarlicBread());
                } else if (option==3) {
                    System.out.println("How many beverage's ?: ");
                    count = user.nextInt();
                    finalPriceOfBeverage=order.calculatePriceOfBeverage(count,order.getPriceOfBeverage());
                }else if (option<0||option>3) {
                    System.out.println("invalid Option try again");
                }
                float totalAmount=order.calculateTotalBill(finalPriceOfPizza,finalPriceOfGarlicBread,finalPriceOfBeverage);
                totalBillIfRepeated=totalAmount+totalBillIfRepeated;

                System.out.println("1 to reorder and 0 to exit");
                ask= user.nextInt();
                if(ask!=0 && ask!=1){
                    System.out.println("1 to reorder 0 to exit");
                    ask= user.nextInt();
                }
                float discountAmount=order.calculateDiscountAndReturnBillAmount(totalBillIfRepeated);
                order.displayOrderDetails(pizzaCountCounter,garlicBreadCountCounter,beverageCountCounter,totalBillIfRepeated,discountAmount);
            }while(ask==1);

        }
    }

