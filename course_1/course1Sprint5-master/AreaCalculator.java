import java.util.Scanner;
class AreaCalculator{
    public double calculateAreaOfSquare(double side){
        double areaOfSquare=side*side;
        System.out.println(areaOfSquare);
        return areaOfSquare;
    }
    public double calculateAreaOfCircle(double radius){
        double areaOfRadius=radius*radius*3.14;
        System.out.println(areaOfRadius);
        return areaOfRadius;
    }
    public double calculateAreaOfRectangle(double length, double breadth){
        double areaOfRectangle=length*breadth;
        System.out.println(areaOfRectangle);
        return areaOfRectangle;
    }
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.println("Enter what you wanna calculate\n1.square\n2.circle\n3.rectangle");
        int number = area.nextInt();
        AreaCalculator cal = new AreaCalculator();
        if(number==1){
            System.out.println("enter the side value: " );
            double side= area.nextDouble();
            cal.calculateAreaOfSquare(side);
        } else if (number==2) {
            System.out.println("enter the radius value: ");
            double radius= area.nextDouble();
            cal.calculateAreaOfCircle(radius);
        }else if(number==3){
            System.out.println("enter the length");
            double length= area.nextDouble();
            System.out.println("enter the breadth");
            double breadth= area.nextDouble();
            cal.calculateAreaOfRectangle(length,breadth);
        }else{
            System.out.println("enter the correct number");
        }
    }
}