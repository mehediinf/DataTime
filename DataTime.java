import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTime {
    public static void main(String[] args) {
        
        System.out.println("\n");
        
        //ZonedDateTime zonedDateTime = ZonedDateTime.now();



         // Parsing a string sequence to Instant 
        //Instant inst1 = Instant.parse("2021-02-09T11:19:42.12Z"); 
        Instant inst1 = Instant.now();
        System.out.println("Parsed instant is " + inst1); 
        
        // Using isSupported() method to check whether the 
        // specified field is supported or not 
        System.out.println(inst1.isSupported(ChronoUnit.DAYS)); 
        System.out.println(inst1.isSupported(ChronoUnit.YEARS)); 
        
        // Using Instant.now() to get current instant 
        Instant cur = Instant.now(); 
        System.out.println("Current Instant is " + cur); 
        
        // Using minus() method to find instant value after 
        // subtraction 
        Instant diff = inst1.minus(Duration.ofDays(70)); 
        System.out.println("Instant after subtraction : "+ diff); 
        
        // Using plus() method to find instant value after 
        // addition 
        Instant sum = inst1.plus(Duration.ofDays(10)); 
        System.out.println("Instant after addition : "+ sum);



       /*  LocalTime now = LocalTime.now();
        System.out.println("Current Time : "+now);

        LocalTime specific = LocalTime.of(14, 30, 45);
        System.out.println("specific Time : "+specific);

*/


/* 
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("hh:mm:ss dd/mm/yy");

        String date1 = localDateTime.format(dateTimeFormatter);

        System.out.println(date1);

        
*/

        /* long millis = System.currentTimeMillis();  
      
  
        Date date = new Date(millis);      
        System.out.println(date);

        */ 

        //System.out.println(java.time.LocalDate.now()); 


        System.out.println("\n");

    }
}
