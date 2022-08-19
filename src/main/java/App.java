import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        System.out.println("Welcome to Eat");
        while (true) {
            System.out.println("1.New User..? Register");
            System.out.println("2.Already a user ..? Login");
            System.out.println("3.Exit");
            int choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("Username: ");
                String username = sc.next();
                System.out.println("Email :");
                String email = sc.next();
                System.out.println("Password: ");
                String password = sc.next();

                boolean isUserExists = users.stream().anyMatch(user -> (User.getUsername().equals(username)) && (user.getPassword().equals(password)));


            } else if (choose == 2) {
                System.out.println("Enter the mobile Number");
                long phoneNumber = sc.nextLong();
                System.out.println("Type the OTP sent in your mobile");
            }
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
            } else {
                System.out.println("Order Cancelled ");
            }
        }
    }
}
