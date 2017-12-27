import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.Calendar;

import java.util.TimeZone;

public class ToDo  {
  Timer timer;
  int counter= 0;
Scanner input = new Scanner(System.in);
  

      
    
  

 public ToDo ( int seconds )   {
   System.out.println ( "you have 25 seconds to finish" ) ; 
   timer = new Timer (  ) ;
   timer.schedule ( new ToDoTask (  ) , seconds*1000 ) ;
   String name = "", name2 = "", name3 = "";
   
  Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
  Calendar cal2;
  long milis1 = cal1.getTimeInMillis();
  
  
     System.out.println ( "1st question" ) ;
     name = input.next();
     
     cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
     long milis2 = cal2.getTimeInMillis();
 
     long diff = (milis2 - milis1)/1000;
     if(diff > seconds) {
       System.out.println ( "QUIZ OVER" ) ;
     }
     else if (name.equals("a")) {
       counter++;
       System.out.println("Current Score: " + counter);  
     }
     else {
             timer.cancel();
             System.out.println("Wrong ans");
             System.out.println("Final Score: " + counter);
     }

     if(name.equals("a")) {
        System.out.println ( "2st question" ) ;
        name2 = input.next();
        
        cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        milis2 = cal2.getTimeInMillis();
 
        diff = (milis2 - milis1)/1000;
        
        if(diff > seconds) 
           System.out.println ( "QUIZ OVER" );
        else if(name2.equals("b")){
             counter++;
             System.out.println("Current Score: " + counter);  
        }
           else {
             timer.cancel();
             System.out.println("Wrong ans");
             System.out.println("Final Score: " + counter);
           }
        
     }
       if(name2.equals("b")) {
        System.out.println ( "3st question" ) ;
        name3 = input.next(); 
        
        cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        milis2 = cal2.getTimeInMillis();
 
        diff = (milis2 - milis1)/1000;
        if(diff > seconds) 
           System.out.println ( "QUIZ OVER" );
        else if(name3.equals("c")) {
             counter++;
             
        }
         else {timer.cancel();
         
           System.out.println("Wrong ans");
           
         
         }
     
        cal2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        milis2 = cal2.getTimeInMillis();
 
        diff = (milis2 - milis1)/1000;
        
        if(diff < seconds) {
          System.out.println("Final Score: " + counter);
          System.out.println("Quiz took "+ diff + " Seconds.");
        }
        timer.cancel();
        
     }
          
  }


  class ToDoTask extends TimerTask  {
    public void run (  )   {
      
      timer.cancel(); //Terminate the thread
      System.out.println("times up");
      System.out.println("Final Score: " + counter);  
    }
  }
}