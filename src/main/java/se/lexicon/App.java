package se.lexicon;


import java.io.PrintStream;

public class App {
  public static void main(String[] args) {

    Person erik = new Person("Erik", "Svensson", 42, false);
    //erik.setFirstName("Erik");
    //erik.setLastName("Svensson");
    //erik.setAge(42);

    //System.out.println("Person: " + erik.getFirstName() + " " + erik.getLastName());
    System.out.println(erik.personInformation());

    Person mehrdad = new Person("Mehrdad", "Javan", 33);

    Person test = new Person("Test", "Test");







  }
}
