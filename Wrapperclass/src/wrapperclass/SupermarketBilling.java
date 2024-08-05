package wrapperclass;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        // Input loop for adding items
        while (true) {
            System.out.print("Enter item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            items.add(new Item(itemName, itemPrice));
        }

        // Display invoice
        System.out.println("\n\n**********************************************");
        System.out.println("***************** INVOICE ********************");
        System.out.println("**********************************************");
        System.out.printf("%-20s %-10s\n", "Item", "Price");
        System.out.println("----------------------------------------------");
        double total = 0.0;
        for (Item item : items) {
            System.out.printf("%-20s $%-10.2f\n", item.getName(), item.getPrice());
            total += item.getPrice();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-20s $%-10.2f\n", "Total:", total);
        System.out.println("**********************************************");
    }
}
