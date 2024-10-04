import java.util.Scanner;

public class Bakery {
  public static void main(String[] args) {

    /*
    Instantiated baked goods
    Instantiated nutrition
    Printed baked goods
    Printed nutrition
    */
    bakedGoods b1 = new bakedGoods();
    bakedGoods b2 = new bakedGoods("Ube Bread", 4.99);
    

    System.out.println(b1);
    System.out.println(b2);

    Nutrition b3 = new Nutrition();
    Nutrition b4 = new Nutrition("Cinnamon Roll", 8.99, 250, true);

    System.out.println(b3);
    System.out.println(b4);
    
    /*
    User input to choose whether to take food in-store or to-go
    */
    Scanner input = new Scanner(System.in);

    System.out.println("Will you be eating in store or to-go? ");
    String userChoice = input.nextLine();

    System.out.println("You chose to eat: " + userChoice);
    
    input.close();
    
  }
}