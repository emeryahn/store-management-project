public class bakedGoods extends Bakery {
  private String name;
  private double price;
  
  // No-Argument constructor
  public bakedGoods() {
    this("plain", 0.0);
  }

  // Parameterized constructor
  public bakedGoods(String name, double price) {
    this.name = name;
    this.price = price; 
  }

  //Accessor and Mutator Methods
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  // toString() method
  public String toString() {
    return "Name: " + name + "\nPrice: $" + price; 
  }
}
