public class AddNumber {
    public static void main(String[] args) {
        int forSum=0,whileSum=0,doWhileSum=0,A=1,B=100,counter=0;
        //using for
        for(int i=A;i<=B;i++){
            forSum=forSum+i;
        }
        System.out.println("using for: "+forSum);

        //using while
        while(A<=100){
            whileSum=whileSum+A;
            A++;
        }
        System.out.println("using while:"+whileSum);
        //using do while
        A=1;
        do{
            doWhileSum=doWhileSum+A;
            A++;
            counter++;
        }while(counter<100);
        System.out.println("using  dowhile:"+doWhileSum);
    }
}
