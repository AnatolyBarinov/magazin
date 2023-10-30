import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;
    private static final int MAX_CART_ITEMS = 10;

    public Cart() {
        items = new ArrayList<>();
    }

    public boolean addItem(Product item) {
        if (items.size() < MAX_CART_ITEMS) {
            items.add(item);
            return true;
        } else {
            System.out.println("Корзина достигла максимального количества товаров.");
            return false;
        }
    }

    public boolean removeItem(Product item) {
        if (items.contains(item)) {
            items.remove(item);
            return true;
        } else {
            System.out.println("Товар не найден в корзине.");
            return false;
        }
    }

    public void clearCart() {
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}