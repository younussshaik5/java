import java.util.Scanner;

public class Employee_function
{
    String name ;
    String email;
    String address;
    int id;
    long mobileNo;
    int basicSalary;
    int tA;
    int hRA;
    int totalSalary;


    Scanner sc = new Scanner(System.in);

    public void inputEmployeeDetails()
    {
        System.out.println("Please enter name");
        String name  = sc.nextLine();

        System.out.println("Please enter email address");
        String email = sc.nextLine();

        System.out.println("Please enter address");
        String address = sc.nextLine();

        System.out.println("Please enter ID");
        int id  = sc.nextInt();

        System.out.println("Please enter mobile no");
        long mobileNo  = sc.nextLong();

        System.out.println("Please enter basic salary");
        int basicSalary = sc.nextInt();

        System.out.println("Please enter TA");
        int tA = sc.nextInt();

        System.out.println("Please enter HRA");
        int hRA = sc.nextInt();
    }

    public void employeeDetails()
    {
        System.out.println("Roll No of Employee is :" + id);
        System.out.println("mobile number of Employee is :" + mobileNo);
        System.out.println("Name of Employee is :" + name);
        System.out.println("Email of Employee is :" + email);
        System.out.println("Address of Employee is :" + address);
    }

    public int totalSalary()
    {
        int totalSalary= basicSalary + tA + hRA;
        return totalSalary;
    }

    public String designation()
    {
        if (totalSalary<=20000)
        {
           String designationOfEmployee = "Clerk";
           return designationOfEmployee;
        }
        else if (totalSalary>20000 && totalSalary <=50000)
        {
            String designationOfEmployee = "Developer";
            return designationOfEmployee;
        }
        else if (totalSalary>50000 && totalSalary <=80000)
        {
            String designationOfEmployee = "Sr. Developer";
            return designationOfEmployee;
        }
        else
        {
            String designationOfEmployee = "Owner";
            return designationOfEmployee;
        }
    }

    public float taxDeduction()
    {
        if (totalSalary> 50000)
        {
            System.out.println("you have to 10 percent tax");
            float taxAmount = totalSalary*0.10f;
            float finalAmount = totalSalary - taxAmount;
            return finalAmount ;
        }
        else
        {
            System.out.println("you need not to pay tax");
            return totalSalary;
        }
    }

    public static void main(String[] args)
    {
        Employee_function std = new Employee_function();

        std.inputEmployeeDetails();
        std.employeeDetails();

        int employeeTotalSalary = std.totalSalary();
        System.out.println("Total Salary of Employee : "+ employeeTotalSalary);

         String position = std.designation();
        System.out.println("Designation of employee is : "+ position);

        float  afterTaxSalary = std.taxDeduction();
        System.out.println("Final salary of the Employee is : "+ afterTaxSalary);
    }
}