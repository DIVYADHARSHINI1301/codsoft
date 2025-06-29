/**TASK 2
 STUDENT GRADE CALCULATOR
 Input: Take marks obtained (out of 100) in each subject.
 Calculate Total Marks: Sum up the marks obtained in all subjects.
 Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
 average percentage.
 Grade Calculation: Assign grades based on the average percentage achieved.
 Display Results: Show the total marks, average percentage, and the corresponding grade to the user
**/
import java.util.Scanner;
class StudentReport{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int noofsubject=sc.nextInt();
        int[] marks=new int[noofsubject];
        int sum=0;
        for(int i=0;i<noofsubject;i++){
            System.out.println("Enter the Marks for 100 for Subject"+(i+1));
            marks[i]=sc.nextInt();
            
            if(marks[i]<0 || marks[i]>100){
                System.out.println("Invalid Marks");
                i--;
            }
            sum+=marks[i];
        }
        double avgPercent=(double)sum/noofsubject;
        
        if(avgPercent>=90){
            System.out.println("Grade:A");
        }
        else if(avgPercent>=80){
            System.out.println("Grade:B");
        }
        else if( avgPercent>=60){
            System.out.println("Grade:C");
        }
        else if(avgPercent>=50){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:F(Fail)");
        }
         System.out.println(" Result Summary ");
        System.out.println("Total Marks: " + sum + " / " + (noofsubject* 100));
        System.out.printf("Average Percentage: %.2f%%\n", avgPercent);
       
    }
}
