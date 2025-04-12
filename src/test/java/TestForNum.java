import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestForNum {
  @Test
  public void testAssertingEquality() {
    int expected = 10;
    int actual = 10;
    assertEquals(expected, actual);
  }

    @Test
    public void testAdd() {
      App.Calculator calculator = new App.Calculator();
      assertEquals(15, calculator.add(10, 5), "Сложение должно вернуть 15");
    }

    @Test
    public void testSubtract() {
      App.Calculator calculator = new App.Calculator();
      assertEquals(5, calculator.subtract(10, 5), "Вычитание должно вернуть 5");
    }

    @Test
    public void testMultiply() {
      App.Calculator calculator = new App.Calculator();
      assertEquals(50, calculator.multiply(10, 5), "Умножение должно вернуть 50");
    }

    @Test
    public void testDivide() {
      App.Calculator calculator = new App.Calculator();
      assertEquals(2, calculator.divide(10, 5), "Деление должно вернуть 2");
    }

    @Test
    public void testDivideByZero() {
      App.Calculator calculator = new App.Calculator();
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        App.Calculator.divide(10, 0);
      });
      assertEquals("Деление на ноль недопустимо!", exception.getMessage());
    }
  }