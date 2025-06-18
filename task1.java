/**
TASK 1
 NUMBER GAME
 1. Generate a random number within a specified range, such as 1 to 100.
 2. Prompt the user to enter their guess for the generated number.
 3. Compare the user's guess with the generated number and provide feedback on whether the guess
 is correct, too high, or too low.
 4. Repeat steps 2 and 3 until the user guesses the correct number.
 You can incorporate additional details as follows:
 5. Limit the number of attempts the user has to guess the number.
 6. Add the option for multiple rounds, allowing the user to play again.
 7. Display the user's score, which can be based on the number of attempts taken or rounds won.
**/

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
