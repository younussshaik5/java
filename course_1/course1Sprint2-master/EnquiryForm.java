import java.util.Scanner;  // Import the Scanner class

class EnquiryForm {
    public static void main(String[] args) {
      String name="John";
      long contactNumber=412312556;
      String email="john@gmail.com";
      int age=34;
      char gender='M';
      String occupation="Manager";
      double annual_salary=10000;
      String nationality="Indian";
      boolean isMarried=true;

/**
        Scanner Form = new Scanner(System.in);  // Create a Scanner object
        System.out.println("enter the name: ");
        String name = Form.nextLine();
        System.out.println("enter the contactNumber: ");
        long contactNumber = Form.nextLong();
        System.out.println("enter the mail id: ");
        String email = Form.nextLine();
        System.out.println("enter the age: ");
        int age = Form.nextInt();
        System.out.println("enter the gender in 'M or F': ");
        char gender = Form.next().charAt(0);
        System.out.println("enter the occupation: ");
        String occupation = Form.nextLine();
        System.out.println("enter the annual_salary: ");
        double annual_salary = Form.nextDouble();
        System.out.println("enter the nationality: ");
        String nationality = Form.nextLine();
        System.out.println("enter the marital_status in 'true or false': ");
        boolean isMarried = Form.nextBoolean();
*/
        System.out.println("name: "+name);
        System.out.println("contactNumber: "+contactNumber);
        System.out.println("age: "+age);
        System.out.println("email: "+email);
        System.out.println("gender: "+gender);
        System.out.println("occupation: "+occupation);
        System.out.println("annual_salary: "+annual_salary);
        System.out.println("nationality: "+nationality);
        System.out.println("isMarried: "+isMarried);


    }
}
