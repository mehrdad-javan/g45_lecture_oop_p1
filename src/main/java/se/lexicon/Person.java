package se.lexicon;

import java.time.LocalDate;

public class Person {

  // Fields
  public String firstName; // null
  private String lastName; // null
  private int age; // 0
  private boolean sleeping; // false

  public Person() {
    this.sleeping = false;
  }

  public Person(String firstName, String lastName, int age) {
    this(firstName, lastName);
    setAge(age);
  }

  public Person(String firstName, String lastName) {
    this();
    setFirstName(firstName);
    setLastName(lastName);
  }


  public Person(String firstName, String lastName, int age, boolean sleeping) {
    this(firstName, lastName);
    setAge(age);
  }


  // Methods

  // Getters & Setters
  public void setFirstName(String firstName) {
    if (firstName == null) throw new IllegalArgumentException("firstName param was null");
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    if (lastName == null) throw new IllegalArgumentException("lastName param was null");
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setSleeping(boolean sleeping) {
    this.sleeping = sleeping;
  }

  public boolean isSleeping() {
    return sleeping;
  }

  public String personInformation() {
    return " Person: FirstName: " + firstName + " LastName: " + lastName + " Age: " + age;
  }


}
