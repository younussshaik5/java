import java.util.Scanner;
class Method{
    public float totalMarks(float math, float science, float social){
        float total=math+science+social;
        System.out.println("total is "+total);
        return total;
    }
    public float avgMarks(float math, float science, float social){
        float totalAvg=(math+science+social)/3;
        System.out.println("total avg"+totalAvg);
        return totalAvg;
    }

    public static void main(String[] args) {
        Scanner student=new Scanner(System.in);
        System.out.println("enter math marks: ");
        float math=student.nextFloat();
        System.out.println("enter math marks: ");
        float science=student.nextFloat();
        System.out.println("enter math marks: ");
        float social=student.nextFloat();
        Method total = new Method();
        total.totalMarks(math,science,social);
        Method avg = new Method();
        avg.avgMarks(math,science,social);

    }
}