package Ex_08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    ShoppingCart shoppingCart;
    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart("CD24DP");
        shoppingCart.addItem("Arroz");
        shoppingCart.addItem("Ganza");
    }

    @Test
    void addItem() {
        assertTrue(shoppingCart.containsItem("Arroz"));
    }

    @Test
    void removeItem() {
        shoppingCart.removeItem("Arroz");
        assertFalse(shoppingCart.containsItem("Arroz"));
        assertTrue(shoppingCart.containsItem("Ganza"));

    }

    @Test
    void containsItem() {
        assertTrue(shoppingCart.containsItem("Arroz"));
        assertFalse(shoppingCart.containsItem("Gel de pelos dos gluteos"));
    }

    @Test
    void getItemCount() {
        assertEquals(2,shoppingCart.getItemCount());
    }

    @Test
    void clearCart() {
        shoppingCart.clearCart();
        assertEquals(0,shoppingCart.getItemCount());
    }
}