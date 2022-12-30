import java.util.Scanner;
class SumOfPrimeInRange{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
		System.out.println("enter the value of A");
        int A = myObj.nextInt();
		System.out.println("enter the value of B");
        int B = myObj.nextInt();
        int flag=0, sum=0;
        for(int i=A;i<=B;i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                sum = sum + i;
            }
            flag = 0;
        }
        System.out.println(sum);
    }
}