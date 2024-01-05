package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal;
    @BeforeEach
    public void setUp(){
        this.animal = new Animal("Cao",Alimento.CARNE );
    }

    @Test
    void comerTeste(){
        assertTrue(animal.estaComFome());
    }

}