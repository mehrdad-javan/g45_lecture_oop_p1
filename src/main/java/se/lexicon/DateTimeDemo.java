package se.lexicon;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

  public static void main(String[] args) {
    ex4();
  }


  public static void ex1(){
    LocalDate currentDate = LocalDate.now();
    System.out.println("Current Date: " + currentDate);
    System.out.println(currentDate.getYear());
    System.out.println(currentDate.getDayOfWeek());

    LocalDate newDate = currentDate.plusDays(2);
    System.out.println(newDate);

    LocalDate birthDay1 = LocalDate.parse("1989-02-27");
    LocalDate birthDay2 = LocalDate.of(1989,2,27);

    LocalTime currentTime = LocalTime.now();
    System.out.println("Current Time: " + currentTime);
    System.out.println(currentTime.getHour());

    System.out.println(currentTime.truncatedTo(ChronoUnit.MINUTES));

    LocalTime meetingTime1 = LocalTime.parse("09:00");
    LocalTime meetingTime2 = LocalTime.of(9,0);

  }

  public static void ex2(){

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("Current Date & Time: " + localDateTime);
    System.out.println(localDateTime.truncatedTo(ChronoUnit.SECONDS));

    LocalDate testDate1 = LocalDate.parse("2020-01-01");
    LocalTime testTime1= LocalTime.parse("09:10");

    LocalDateTime testDateTime = LocalDateTime.of(testDate1, testTime1);

  }

  public static void ex3 (){
    LocalDate birthDate = LocalDate.parse("1989-02-27");
    LocalDate currentDate = LocalDate.now();
    Period period = Period.between(birthDate, currentDate);
    System.out.println(period.getYears());

  }

  public static void ex4(){
    LocalTime startTime = LocalTime.parse("08:00");
    LocalTime endTime = LocalTime.parse("17:00");

    Duration duration= Duration.between(startTime, endTime);
    System.out.println("Second: " + duration.getSeconds());
    System.out.println("Minute: " + duration.getSeconds() / 60);
    System.out.println("Hour: " + (duration.getSeconds() / 60)  / 60);
  }






}
