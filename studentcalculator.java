import java.util.*;
public class studentcalculator {
    public static void averagepercent(int totnum){
        Scanner sc = new Scanner(System.in);
        float totmark = 0;
        float avgpercen = 0;
        for (int i=0 ; i<totnum ; i++){
            System.out.println("enter marks of each subject one by one ,for " +
             (i+1) + " subject :-" );
            totmark = totmark + sc.nextInt();
        }
            avgpercen = (totmark/(totnum*100))*100;
            String grade = "";
            if (avgpercen > 90) {
                grade = "A";
            }else if (avgpercen > 80) {
                grade = "B";
            }else if (avgpercen > 70) {
                grade = "C";
            }else if (avgpercen > 60) {
                grade = "D";
            }else {
                grade = "F";
            }
            System.out.println("Total marks was obtained will be "+ totmark + 
            "\nAverage percentage was obtained will be " + avgpercen + " \nGrade was obtained will be "+ grade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of count subject you want :- ");
        int totsub = sc.nextInt();
        averagepercent(totsub);
    }
}
