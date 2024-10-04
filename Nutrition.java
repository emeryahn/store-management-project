public class Nutrition extends bakedGoods {
  // Instance variables
  private int calories;
  private boolean isHealthy;

  // No-argument constructor
  public Nutrition() {
    this("plain", 0.0, 0, false);
  }

  // Parameterized constructor
  public Nutrition(String name, double price, int calories, boolean isHealthy) {
    super(name, price);
    this.calories = calories;
    this.isHealthy = isHealthy;
  }

  // Accessor and mutator methods
  public int getCalories() {
    return calories;
  }

  public boolean isHealthy() {
    return isHealthy;
  }

  // toString() method
  public String toString() {
    return super.toString() + "\nCalories: " + calories + "\nIs healthy? " + isHealthy;
  }


  
}