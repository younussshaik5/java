//import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        //Scanner user=new Scanner(System.in);
        int a= 1;
        int b=50;
        int sum=0;
        for(int i=a;i<=b;i++) {
            if(i%2==0){
                sum=sum+i;
            }
        }
    }
}
