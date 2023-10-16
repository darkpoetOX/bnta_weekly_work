import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        //Given
        //When
        int actual = calculator.add(5, 6);
        //Then
        int expected = 11;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSubtractNumbers(){
        int actual = calculator.subtract(5,6);
        int expected = -1;
        assertThat(actual).isEqualTo(expected);

    }
}
