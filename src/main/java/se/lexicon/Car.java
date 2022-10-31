package se.lexicon;

public class Car {

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
    setBrand(brand);
    this.color = color;
    this.model = model;
    this.year = year;
  }





  // Methods
  public String getCarInformation() {
    return "Car: brand: " + brand + " Model: " + model + " Year: " + year;
  }

  public String getOwnerInformation() {
    if (owner != null) {
      return owner.personInformation();
    } else {
      return null;
    }
  }

  // Getters & Setters

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
