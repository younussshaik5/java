import java.util.Scanner;
class ReverseDigitDemo {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the digits you want to reverse and press enter: ");
        int input= user.nextInt();//taking input here
        System.out.println("Given digits: " + input);
        int reverse = 0;// taking as zero
        // run loop until input becomes 0
        while(input != 0) {
            // get last digit from input
            int digit = input % 10;
            input=input/10;// remove the last digit from num
            reverse = (reverse * 10) + digit;// if diving by 10 can remove , then multiplying will sort it 
            
        }
        System.out.println("Reversed Number: " + reverse);
    }
}