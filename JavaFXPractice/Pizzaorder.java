package application;
import java.util.ArrayList;

public class Pizzaorder {
    private int size; // 10, 12, 14, or 16 inches
    private String crustType;
    private String name;
    private ArrayList<String> toppings;

    // Constructor
    public Pizzaorder(int size, String crustType, String name) {
        this.size = size;
        this.crustType = crustType;
        this.name = name;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public double calculatePrice() {
        double basePrice;
        switch (size) {
            case 10:
                basePrice = 10.99;
                break;
            case 12:
                basePrice = 12.99;
                break;
            case 14:
                basePrice = 13.99;
                break;
            case 16:
                basePrice = 15.99;
                break;
            default:
                basePrice = 10.99; // Default to 10-inch pizza
        }

        double taxRate = 0.055; // 5.5% tax
        double price = basePrice + (toppings.size() * 1.25); // Adding $1.25 for each topping

        double tax = price * taxRate;
        price += tax;

        return price;
    }
    
    @Override
    public String toString() {
        StringBuilder toppingsString = new StringBuilder();
        for (String topping : toppings) {
            toppingsString.append(topping).append(", ");
        }

        return "Pizza{" +
                "size=" + size +
                ", crustType='" + crustType + '\'' +
                ", name='" + name + '\'' +
                ", toppings=[" + toppingsString.toString().trim() + "]";
    }
}
