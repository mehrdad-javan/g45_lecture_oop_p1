package se.lexicon;


import java.io.PrintStream;

public class App {
  public static void main(String[] args) {

    Person erik = new Person("Erik", "Svensson", 42, false);
    System.out.println(erik.personInformation());
    Person mehrdad = new Person("Mehrdad", "Javan", 33);
    System.out.println(mehrdad.personInformation());
    Person test = new Person("Test", "Test");
    System.out.println(test.personInformation());

    System.out.println("-------------------");
    Car volvo = new Car("Volvo", "Gray", "V60");
    volvo.setOwner(erik);
    System.out.println(volvo.getCarInformation());
    System.out.println(volvo.getOwnerInformation());


    Car bmw = new Car("BMW", "Black", "X6", 2020);
    bmw.setOwner(mehrdad);
    System.out.println(bmw.getCarInformation());
    System.out.println(bmw.getOwnerInformation());







  }
}
