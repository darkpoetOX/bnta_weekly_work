import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    @Test
    public void myFirstTest(){
        //BDD (behaviour driven development)

        //Given..
        //Arrange
        String input = "HELLO";
        //When..
        ///Act
        String actual = input.toLowerCase();
        //Then..
        //Assert
        String expected = "hello";

        assertThat(actual).isEqualTo(expected);
    }
}
