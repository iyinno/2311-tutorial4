
public class ShoppingCart {
    private int items;

    public ShoppingCart(int initialItems) {
        items = initialItems;
    }

    public void addItem(int quantity) {
        if (quantity > 0) {
            items += quantity;
        }
    }

    public void removeItem(int quantity) {
        if (items > quantity) {
            items -= quantity;
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5);
        cart.removeItem(5);
        System.out.println("Remaining items in cart: " + cart.items);
    }
}