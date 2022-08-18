import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Menu List");
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        menuArrayList.add(new Menu(1, "Chicken briyani", 200));
        menuArrayList.add(new Menu(2, "Mutton briyani", 300));
        menuArrayList.add(new Menu(3, "Chicken rice", 100));
        menuArrayList.add(new Menu(4, "Crown pizza", 500));
        menuArrayList.forEach(items -> {
            System.out.println(items.getId() + "." + items.getItems() + "-" + items.getPrice());
        });
        System.out.println("Pick Your Favourite One....!!!");
        int choice = sc.nextInt();
        Menu selectedMenu = menuArrayList.get(choice - 1);
        String food = selectedMenu.getItems();
        System.out.println(food);
        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();
        int totalPrice = quantity * selectedMenu.getPrice();
        System.out.println("Your total - " + totalPrice);
        System.out.println("Can we proceed to the order");
        String str = sc.next();
        if (str.equals("yes")) {
            System.out.println("Your Food is successfully Ordered ");
        }
        else{
            System.out.println("Order Cancelled ");
        }
    }
}
