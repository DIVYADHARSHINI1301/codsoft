// Fixing empty file issue
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