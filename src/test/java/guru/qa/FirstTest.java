package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void FirstTest() {
        Assertions.assertFalse(3 <= 0);

    }
    @Test
    void SecondTest() {
        Assertions.assertFalse(3<=1);
    }
    @Test
    void ThirdTest() {
        Assertions.assertFalse(3 <= 2);
    }
}
