import java.util.Timer;
import java.util.TimerTask;

public class ToDo  {
  Timer timer;  //Decalring timer

  

  public static void main ( String args [  ]  )   {
    System.out.println ( "Schedule something to do in given seconds." ) ;
    new ToDo ( 2 ) ;
    System.out.println ( "Waiting." ) ;
    
    
  }

 
public ToDo ( int seconds )   {
    timer = new Timer (  ) ;
    timer.schedule ( new ToDoTask (  ) , seconds*950 ) ;
  }


  class ToDoTask extends TimerTask  {
    public void run (  )   {
      System.out.println ( "OK, It's time to do something!" ) ;
      timer.cancel (  ) ; //Terminate the thread
      System.out.print("ksdjcfksdrhvgukhfukvgbn");
    }
  }
}