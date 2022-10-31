package se.lexicon;

public class Car {

  private static int sequencer = 1000; // 1001
  // Fields
  private int id;
  private String brand;
  private String color;
  private String model;
  private int year;
  private Person owner;




  // Constructors
  public Car() {
    this.year = 2022;
    this.id = ++sequencer;
  }

  // Constructors
  public Car(String brand, String color, String model) {
    this();
    setBrand(brand);
    this.color = color;
    this.model = model;
  }

  // Constructors
  public Car(String brand, String color, String model, int year) {
    this.id = ++sequencer;

    setBrand(brand);
    this.color = color;
    this.model = model;
    this.year = year;
  }





  // Methods
  public String getCarInformation() {
    return "Car: Id: " + id + " brand: " + brand + " Model: " + model + " Year: " + year;
  }

  public String getOwnerInformation() {
    if (owner != null) {
      return owner.personInformation();
    } else {
      return null;
    }
  }

  // Getters & Setters

  public int getId(){
    return id;
  }


  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public Person getOwner() {
    return owner;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if (brand == null) throw new IllegalArgumentException("Brand param was null");
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }


}
