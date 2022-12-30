import java.util.Scanner;

class WeightedAverage{

    public void calculateWeightedAverage(float assignmentScore,float projectScore,float quizScore, float midTermScore,float finalExamScore){
        //******"Below weightage is fixed"**********
        int assignmentWeight=10;
        int projectWeight=35;
        int quizWeight=10;
        int midTermWeight=15;
        int finalExamWeight=30;
        float assignmentPercentageScore=(assignmentWeight/100.0f)*assignmentScore;
        float projectPercentageScore=(projectWeight/100.0f)*projectScore;
        float quizPercentageScore=(quizWeight/100.0f)*quizScore;
        float midTermPercentageScore=(midTermWeight/100.0f)*midTermScore;
        float finalExamPercentageScore=(finalExamWeight/100.0f)*finalExamScore;
        float overallPercentage=(assignmentPercentageScore+projectPercentageScore+quizPercentageScore+midTermPercentageScore+finalExamPercentageScore);
        System.out.printf("%3s %35s \n", "Weights", "% value of Score");
        System.out.printf("%3s %31f \n", "Assignments", assignmentPercentageScore);
        //return assignmentScore;
        System.out.printf("%3s %35f \n", "Projects", projectPercentageScore);
        //return projectPercentageScore;
        System.out.printf("%3s %35f \n", "Quizzes", quizPercentageScore);
        //return quizPercentageScore;
        System.out.printf("%3s %35f \n", "Mid term", midTermPercentageScore);
        //return midTermPercentageScore;
        System.out.printf("%3s %33f \n", "Final Exam", finalExamPercentageScore);
        //return finalExamScore;
        System.out.println("The Weighted average score is "+overallPercentage);
        //return overallPercentage;
    }

    public static void main(String[] args) {
        Scanner students=new Scanner(System.in);
        WeightedAverage run=new WeightedAverage();
        System.out.println("Enter Assignment Score: ");
        float assignmentScore= students.nextFloat();
        System.out.println("Enter Project Score: ");
        float projectScore= students.nextFloat();
        System.out.println("Enter Quiz Score: ");
        float quizScore= students.nextFloat();
        System.out.println("Enter Mid Term Score: ");
        float midTermScore= students.nextFloat();
        System.out.println("Enter Final Exam Score: ");
        float finalExamScore= students.nextFloat();
        run.calculateWeightedAverage(assignmentScore,projectScore,quizScore,midTermScore,finalExamScore);
    }
}