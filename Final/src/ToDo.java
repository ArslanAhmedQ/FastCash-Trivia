import java.util.Timer;    //importing packages
import java.util.TimerTask;
import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;

// Arslan, Sai, Ishaan 
// June 03, 2014
// ICS 4U0
// Fast Cash

/** program description
 * 
 * @author ArslanAhmed
 *
 */


  public class ToDo  {
  Timer timer;
  int counter= 0;
  
  Scanner input = new Scanner(System.in);
  

  public static void main ( String args [  ]  )   
  {
     new ToDo ( 80 ) ;
  }     
    
  
 public ToDo ( int seconds )   {
  
    
  String answer1 = "", answer2 = "", answer3 = ""; //Declaring variables
  String answer6 = "", answer7 = "", answer8 = "";
  String nameofperson = "";
  int answerchoice; 
  
   
  System.out.println("Hello, Please enter ur name? *");
  nameofperson = input.next();
    
 
     System.out.println ( "So " + nameofperson + ", most of the people already know the rules but i will give you a "  //Create a table 
       + "quick instruction beofore you begin, I know you are pretty excited to earn upto 10000 thousand dollars.");
     System.out.println ("With no time delay, for first question gets correct you earn 1 point which is 2000 dollars, ,"
       + "  and you have exactly 60 seocnds to answer all five questions");
     System.out.println("");
     
     timer = new Timer (  ) ;
     timer.schedule ( new ToDoTask (  ) , seconds * 1000 ) ;
     
     System.out.println("You have two categories, general knowledge or sports, Press 1 for knowledge or press 2 for sports");
     answerchoice = input.nextInt();
    
     if (answerchoice == 1)
     {
      Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         Calendar cal2;
         long milis1 = cal1.getTimeInMillis();
      
         System.out.println("");
         System.out.println ( "Which chemical element has the shortest name?" ) ;
         answer1 = input.next();
         
         cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         long milis2 = cal2.getTimeInMillis();
     
         long diff = (milis2 - milis1)/1000;
         if(diff > seconds) {
           System.out.println ( "QUIZ OVER" ) ;
         }
         else if (answer1.equals("tin")) {
           counter++;
           System.out.println("Current Score: " + counter);  
           
         }
         else {
                 timer.cancel();
                 System.out.println("Wrong answer");
                 System.out.println("Final Score: " + counter);
                 System.out.println("You failed to answer all question but still you are going with the next time chance to come");
         }

         if(answer1.equals("tin")) {
         System.out.println("");
            System.out.println ( "At the beginning of the 1990s, which country had the most camels?" ) ;
            answer2 = input.next();
            
            cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            milis2 = cal2.getTimeInMillis();
     
            diff = (milis2 - milis1)/1000;
            
            if(diff > seconds) 
               System.out.println ( "QUIZ OVER" );
            else if(answer2.equals("somalia")){
                 counter++;
                 System.out.println("Current Score: " + counter);  
           }
               else {
                 timer.cancel();
                 System.out.println("Wrong answer");
                 System.out.println("Final Score: " + counter);
                 System.out.println("You failed to answer all question but still you are going with $ 2000");
               }
            
         }
           if(answer2.equals("somalia")) {
         System.out.println("");   
            System.out.println ( "What word do we use to describe the a sexual reproduction of a genetic carbon copy of an animal or plant?" ) ;
            answer3 = input.next(); 
            
            cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            milis2 = cal2.getTimeInMillis();
     
            diff = (milis2 - milis1)/1000;
            if(diff > seconds) 
               System.out.println ( "QUIZ OVER" );
            else if(answer3.equals("clone")) {
                 counter++;
                 
            }
             else {timer.cancel();
             
               System.out.println("Wrong answer");
               System.out.println("You failed to answer all question but still you are going with $ 4000");
             
             }
         
            cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            milis2 = cal2.getTimeInMillis();
     
            diff = (milis2 - milis1)/1000;
            
            if(diff < seconds) {
              System.out.println("Final Score: " + counter);
              System.out.println("");
              System.out.println("Congratulations you have earned 10000 dollars and it took you "+ diff + " seconds to finish it!");
            }
            timer.cancel();
           }
           
     }
           //choice no 2
            
            if (answerchoice == 2)
           {
            
              System.out.println("Choice = 2");
              Calendar cal11 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
               Calendar cal22;
               long milis11 = cal11.getTimeInMillis();
            
               System.out.println("");
               System.out.println ( "Who won the Cricket World cup 2015?");
               answer6 = input.next();
               
               cal22 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
               long milis22 = cal22.getTimeInMillis();
           
               long difference = (milis22 - milis11)/1000;
               if(difference > seconds) {
                 System.out.println ( "QUIZ OVER" ) ;
               }
               else if (answer6.equals("australia")) {
                 counter++;
                 System.out.println("Current Score: " + counter);  
                 
               }
               if (answerchoice == 2)
               {
                       timer.cancel();
                       System.out.println("Wrong answer");
                       System.out.println("Final Score: " + counter);
                       System.out.println("You failed to answer all question but still you are going, with the next time chance to come");
               }

               if(answer6.equals("australia")) {
               System.out.println("");
                  System.out.println ( "Which player of germany soocer team became the man of the match for FIFA world cup 2015");
                  answer7 = input.next();
                  
                  cal22 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                  milis22 = cal22.getTimeInMillis();
           
                  long diff = (milis22 - milis11)/1000;
                  
                  if(difference > seconds) 
                     System.out.println ( "QUIZ OVER" );
                  else if(answer7.equals("gotze")){
                       counter++;
                       System.out.println("Current Score: " + counter);  
                 }
                     else {
                       timer.cancel();
                       System.out.println("Wrong answer");
                       System.out.println("Final Score: " + counter);
                       System.out.println("You failed to answer all question but still you are going with $ 2000");
                     }
                  
               }
                 if(answer7.equals("gotze")) {
               System.out.println("");   
                  System.out.println ( "What word do we use to describe the a sexual reproduction of a genetic carbon copy of an animal or plant?" ) ;
                  answer8 = input.next(); 
                  
                  cal22 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                  milis22 = cal22.getTimeInMillis();
           
                  long diff = (milis22 - milis11)/1000;
                  if(difference > seconds) 
                     System.out.println ( "QUIZ OVER" );
                  else if(answer8.equals("clone")) {
                       counter++;
                       
                  }
                   else {timer.cancel();
                   
                     System.out.println("Wrong answer");
                     System.out.println("You failed to answer all question but still you are going with $ 4000");
                   
                   }
               
                 cal22 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                  milis22 = cal22.getTimeInMillis();
           
                  diff = (milis22 - milis11)/1000;
                  
                  if(difference < seconds) {
                    System.out.println("Final Score: " + counter);
                    System.out.println("");
                    System.out.println("Congratulations you have earned 10000 dollars and it took you "+ diff + " seconds to finish it!");
                  }
                  timer.cancel();
                  
                 }
           }
 
    
  }

  class ToDoTask extends TimerTask  {
    public void run (  )   {
      
      timer.cancel(); //Terminate the thread
      System.out.println("");
      System.out.println("times up");
      System.out.println("Final Score: " + counter);  
    }
  }
}
