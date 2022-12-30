import java.util.Scanner;

class AreaCalculator{
    public static void main(String[] args) {
        //area of square= side * side
        //area of circle= 3.14* radius * radius
        //area of rectangle= length * breadth/Width
        Scanner area = new Scanner(System.in);
        System.out.println("Enter what you wanna calculate\n1.square\n2.circle\n3.rectangle");
        int number = area.nextInt();
        switch (number) {
            case 1: {
                System.out.println("enter the side values for sqaure");
                float side = area.nextFloat();
                float square = side * side;
                System.out.println("Area of square is: "+square);
                break;
            }
            case 2: {
                System.out.println("enter value of radius for circle");
                double radius = area.nextFloat();
                double circle = 3.14 * radius * radius;
                System.out.println("Area of Circle: "+circle);
                break;
            }
            case 3: {
                System.out.println("enter the length of rectangle");
                float length= area.nextFloat();
                System.out.println("enter the breadth of rectangle");
                float breadth= area.nextFloat();
                float rectangle=length*breadth;
                System.out.println("Area of Rectangle: "+rectangle);
                break;
            }
            default:
                System.out.println("You have entered wrong option");
        }
    }
}

