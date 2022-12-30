import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        int sumEven=0,sumOdd=0;
        System.out.println("Enter the digits number: ");
        int input= user.nextInt();
        while(input>0&&input!=0){
            int digit = input % 10;//storing last value
            if (digit%2==0){//checking if that value is odd or even
                sumEven=sumEven+digit;
            } else if (digit %2!=0){
                sumOdd=sumOdd+digit;
            }
            input=input/10;//eliminating last value and storing the updated number
        }

        while(input==0){
            System.out.println("Input cant be zero");
            break;
        }
        while(input<0){
            System.out.println("Input cant be negative");
            break;
        }
        System.out.println("the sum of Even: "+sumEven);
        System.out.println("the sum of Odd: "+sumOdd);
    }
}