import java.util.*;

class OutOfStockError extends Exception {
    public OutOfStockError(String message) {
        super(message);
    }
}

class DiscountCodeError extends Exception {
    public DiscountCodeError(String message) {
        super(message);
    }
}

class EmptyCartError extends Exception {
    public EmptyCartError(String message) {
        super(message);
    }
}

class PaymentProcessingError extends Exception {
    public PaymentProcessingError(String message) {
        super(message);
    }
}

public class ShoppingCart {
    private Map<String, Integer> cart = new HashMap<>();
    private Map<String, Integer> stock = new HashMap<>();
    private double total = 0.0;
    private boolean discountApplied = false;

    public ShoppingCart() {

        stock.put("apple", 10);
        stock.put("banana", 5);
        stock.put("laptop", 2);
    }

    public void addItem(String item, int quantity) throws OutOfStockError {
        if (!stock.containsKey(item) || stock.get(item) < quantity) {
            throw new OutOfStockError("Item " + item + " is out of stock.");
        }
        cart.put(item, cart.getOrDefault(item, 0) + quantity);
        stock.put(item, stock.get(item) - quantity);
        System.out.println(quantity + " x " + item + " added to cart.");
        total += quantity * 10;
    }

    public void applyDiscount(String code) throws DiscountCodeError {
        if (code.equals("SAVE10")) {
            total *= 0.9;
            discountApplied = true;
            System.out.println("Discount applied. New total: " + total);
        } else {
            throw new DiscountCodeError("Invalid discount code: " + code);
        }
    }

    public void checkout() {
        try {
            if (cart.isEmpty()) {
                throw new EmptyCartError("Your cart is empty!");
            }

            if (new Random().nextBoolean()) {
                throw new PaymentProcessingError("Payment could not be processed.");
            }

            System.out.println("Checkout successful. Total paid: " + total);
        } catch (EmptyCartError e) {
            System.err.println("Error: " + e.getMessage());
        } catch (PaymentProcessingError e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            cart.addItem("apple", 3);
            cart.addItem("laptop", 1);
        } catch (OutOfStockError e) {
            System.err.println("Add Item Error: " + e.getMessage());
        }

        try {
            cart.applyDiscount("SAVE10");
        } catch (DiscountCodeError e) {
            System.err.println("Discount Error: " + e.getMessage());
        }

        cart.checkout();
    }
}
