public class Menu {
    private int id;
    private String items;
    private int price;

    public Menu(int id, int price) {
        this.id = id;
        this.items = items;
        this.price = price;
    }

    public Menu() {
    }

    public Menu(int id, String items, int price) {
        this.id = id;
        this.items = items;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

}
