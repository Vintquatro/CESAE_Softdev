import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    public void setUp(){
         this.calculator = new Calculator() ;
     }

    @Test
    public void addTest(){

        assertEquals(10,calculator.add(7,3));

    }



}