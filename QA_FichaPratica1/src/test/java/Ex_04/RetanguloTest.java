package Ex_04;

import Ex_03.Alimento;
import Ex_03.Animal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo1;
    @BeforeEach
    public void setUp(){
        retangulo1 = new Retangulo(10,20) ;
    }

    @Test
    public void calcularArea() {
        assertEquals(200, retangulo1.calcularArea());

    }

    @Test
    void calcularPerimetro() {
        assertEquals(60, retangulo1.calcularPerimetro());

    }
}