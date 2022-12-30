public class OakBridgeSchool {
    static int[]rollNo={101,102,103,104,105,106,107,108,109,110};

    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        int []totalMarks= new int [rollNo.length];
        if(math.length>0&&science.length>0&&english.length>0){
            for(int i=0;i<rollNo.length;i++){
                totalMarks[i]=math[i]+science[i]+english[i];
            }
        }
        else{
            totalMarks=null;
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int [] averageMarksOfEach=new int [rollNo.length];
        if(noOfSubjects==3&&totalMarks.length>0){

            for(int i=0;i<rollNo.length;i++){
                averageMarksOfEach[i]=totalMarks[i]/noOfSubjects;
            }
        }
        else{
            averageMarksOfEach=null;
        }
        return averageMarksOfEach;
    }
    public int calculateAverageScienceMarks (int[] science)
    {
        int sum=0;
        int average;
        if(science.length>0){
            for(int i=0;i<rollNo.length;i++){
                sum=sum+science[i];
            }
            average=sum/rollNo.length;
        }
        else{
            average=-1;
        }
        return average;
    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        int sum=0;
        int average;
        if(english.length>0){
            for(int i=0;i<rollNo.length;i++){
                sum=sum+english[i];
            }
            average=sum/rollNo.length;
        }
        else {
            average=-1;
        }
        return average;
    }
    public int calculateAverageMathMarks (int[] math) {
        int sum = 0;
        int average;
        if(math.length>0){
            for (int i = 0; i < rollNo.length; i++) {
                sum = sum + math[i];
            }
            average=sum/rollNo.length;
        }
        else{
            average=-1;
        }
        return average;
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool=new OakBridgeSchool();

        int marksOfEachSubject=100;
        int TotalNoOfSubjects=3;
        int []math={88,89,100,70,60,80,35,3,25,56};
        int[]science={80,83,99,67,56,84,38,9,32,65};
        int[]english={90,98,100,65,54,82,40,13,45,67};

        String[]names={"sam", "kam", "dam", "ram", "jan","ham", "tina","china","rina", "stan"};
        int [] eachStudentTotalMarks=oakBridgeSchool.calculateTotalMarks(math, science, english);
        int [] averageMarksOfEach=oakBridgeSchool.calculateTotalAverageMarksForEachStudent(eachStudentTotalMarks, TotalNoOfSubjects);

        for(int i=0;i<rollNo.length;i++){

            System.out.println("----------------------------------------------------------\n " +
                    "Student Name  ::"+names[i]+"|| Roll Number ::"+rollNo[i]+
                    "\n----------------------------------------------------------\n The total marks :"
                    +eachStudentTotalMarks[i]+"/"+TotalNoOfSubjects*marksOfEachSubject+"\n " +
                    "The average marks  :"+averageMarksOfEach[i]+"\n----------------------------------------------------------");


            int averageScienceMarks=oakBridgeSchool.calculateAverageScienceMarks(science);
            System.out.println("Average Science marks scored by the class is "+averageScienceMarks);
            int averageMathMarks=oakBridgeSchool.calculateAverageMathMarks(math);
            System.out.println("Average Maths marks scored by the class is "+averageMathMarks);

            int averageEnglishMarks=oakBridgeSchool.calculateAverageEnglishMarks(english);
            System.out.println("Average English marks scored by the class is "+averageEnglishMarks);
        }
    }
}
	