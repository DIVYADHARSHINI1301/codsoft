import java.util.Scanner;
import java.util.Random;
class Randommatching{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r1=new Random();
        int randomnumber=r1.nextInt(100);
        int noofattempts=10;
        int attempts=10;
        int count=0;
       
        boolean playagain=true;
        System.out.println("Welcome to Number Hunt!!");
        System.out.println("Guess the number between 1 and 100 you have ony limited attempts ");
        while(playagain){
        count = 0;
       
        for(int i=0;i<noofattempts;i++){
            System.out.println("choose the number: ");
            int usernum=sc.nextInt();
            
            if(usernum==randomnumber){
                System.out.println("Yeah you are correct!!!! you have guessed the number in"+(i+1)+"Attempts");
                break;
                
            }
            else if(count==9){
                System.out.println("You reached maximum number of attempts the random number is"+randomnumber);
            }
            else{
                System.out.println("Attempt:"+(i+1));
                if(usernum>randomnumber){
                System.out.println("Too High!!!");
                count++;
            }
                else{
                System.out.println("Too Low!!!");
                count++;
            }
            System.out.println("Remaining no of attempts"+(--attempts));
            }
           
           
        }
        sc.nextLine();
        System.out.println("Shall we go again? The mystery number awaits! (yes/no):");

        String again=sc.nextLine();
        if(again.equalsIgnoreCase("yes")){
            System.out.print("hurayy you got a new chance go ahead!!");
            System.out.println();
            playagain=true;
            
        }
        else if(again.equalsIgnoreCase("no")){
            playagain=false;
            System.out.println("Thank You!! Hope You enjoyed..");
            
        }
        else{
            System.out.println("Invalid input");
        }
     }
      System.out.println("Game Over!");
      System.out.println("Number of attempts taken"+(count+1));
        
    }
}