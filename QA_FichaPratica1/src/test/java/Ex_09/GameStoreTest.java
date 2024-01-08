package Ex_09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStoreTest {
        GameStore gameStore;
        VideoGame videoGame1;
        VideoGame videoGame2;
    @BeforeEach
    void setUp() {
    gameStore = new GameStore();
    videoGame1 = new VideoGame("Grand Theft Auto V", "Rockstar Games", 25.0, 40.0);
    videoGame2 = new VideoGame("Minecraft", "Mojang Studios", 15.0, 30.0);
    gameStore.addGameToStock(videoGame1);
    }

    @Test
    void addGameToStock() {
        assertTrue(gameStore.getStock().contains(videoGame1));
        assertFalse(gameStore.getStock().contains(videoGame2));
        assertEquals(1,gameStore.getStock().size());


    }

    @Test
    void sellGame() {
        assertEquals(1,gameStore.getStock().size());
        assertTrue(gameStore.getStock().contains(videoGame1));
        assertFalse(gameStore.getStock().contains(videoGame2));
        gameStore.sellGame(gameStore.getStock().indexOf(videoGame1));
        assertEquals(0,gameStore.getStock().size());
        assertFalse(gameStore.getStock().contains(videoGame1));
    }

}