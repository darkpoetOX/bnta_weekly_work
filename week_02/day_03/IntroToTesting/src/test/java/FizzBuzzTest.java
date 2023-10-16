import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
    fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canReturnFizz(){
        //Given
        //When
        String result = fizzBuzz.getFizzBuzz(3);
        //Then
        String expected = "Fizz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnBuzz(){
        String result = fizzBuzz.getFizzBuzz(5);
        String expected ="Buzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnFizzbuzz(){
        String result = fizzBuzz.getFizzBuzz(15);
        String expected = "FizzBuzz";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canReturnNumberAsString(){
        String result = fizzBuzz.getFizzBuzz(4);
        String expected = "4";
        assertThat(result).isEqualTo(expected);


    }
}
