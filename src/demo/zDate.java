package demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
  
public class zDate {
 
public static void LocalDateTimeApi()
{
  
 
    LocalDate date = LocalDate.now();
    System.out.println("the current date is "+
                        date);
  
 
    LocalTime time = LocalTime.now();
    System.out.println("the current time is "+
                        time);
      
  
   
    LocalDateTime current = LocalDateTime.now();
    System.out.println("current date and time : "+
                        current);
  
  
     
    DateTimeFormatter format =
      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
   
    String formatedDateTime = current.format(format); 
    
    System.out.println("in formatted manner "+
                        formatedDateTime);
  
  
 
    Month month = current.getMonth();
    int day = current.getDayOfMonth();
    int hour= current.getHour();
    int min=current.getMinute();
    int seconds = current.getSecond();
    System.out.println("Month : "+month+" day : "+
                        day+" Hour : "+ hour+ " Miute : "+min+" Seconds : "+seconds);
  
   
 
  
 
}
 
  
    public static void main(String[] args)
    {
        LocalDateTimeApi();
    }
}