package Ex_02;

import Ex_01.Calculator;
import Ex_03.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
     void testisPalindrome(){
        assertFalse(StringUtils.isPalindrome("teste"));
        assertTrue(StringUtils.isPalindrome("ANA"));
        assertTrue(StringUtils.isPalindrome("teste"));
    }




}