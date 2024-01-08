package Ex_05;

import Ex_04.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
Funcionario funcionario;
@BeforeEach
public void setUp(){
    funcionario= new Funcionario("Jony","69",500);
}

    @Test
    void aumentarsalario() {
    assertEquals(550,funcionario.aumentarsalario(0.1));
    }

    @Test
    void exibirdados() {
    }
}