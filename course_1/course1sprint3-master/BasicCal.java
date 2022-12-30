import java.util.Scanner;

class BasicCal{
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);

        System.out.println("enter the number \n1.Add \n2.Sub\n3.div\n4.mult" );
        int num=cal.nextInt();
        System.out.println("enter the A value:");
        int A=cal.nextInt();
        System.out.println("enter the B value");
        int B=cal.nextInt();
        switch(num){
            case 1:{
                int Add=A+B;
                System.out.println("Result of addition: "+Add);
                break;
            }
            case 2: {
                int Sub=A-B;
                System.out.println("Resultof subtraction: "+Sub);
                break;
            }
            case 3:{
                int Div=A/B;
                System.out.println("Result of division: "+Div);
                break;
            }
            case 4:{
                int Mul=A*B;
                System.out.println("Result of multiplication: "+Mul);
                break;
            }
            default:
                System.out.println("enter the correct input");
        }
    }

}
