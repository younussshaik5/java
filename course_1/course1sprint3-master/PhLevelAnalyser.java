import java.util.Scanner;

class PhLevelAnalyser{
    public static void main(String[] args) {
        Scanner gold= new Scanner(System.in);
        System.out.println("Enter the pH level of water");
        float pH= gold.nextFloat();
        if(pH>=0&&pH<=14){
            if(pH<7){
                System.out.println("pH value is low, partial water change required");
            }
            else if(pH>=7&&pH<=8){
                System.out.println("pH value is fine");
            }
            else if (pH>8) {
                System.out.println("pH value is high, partial water change required");
            }
        }
        else{
            System.out.println("invalid pH value entered");
        }

    }
}