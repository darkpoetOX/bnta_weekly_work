import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LionTest {

    Lion lion;

    @BeforeEach
    void setUp(){
        lion = new Lion("Simba", false);
    }

    @Test
    void canMakeNoise(){
        assertThat(lion.makeNoise()).isEqualTo("ROAR!");
    }

    @Test
    void canEat(){
        assertThat(lion.eat()).isEqualTo("Mmm, that was tasty!");
    }

    @Test
    void canMakeOpinionatedNoise(){
        String expected = "In my opinion, Toy Story was overrated.";
        String actual = lion.makeNoise("Toy Story was overrated");
        assertThat(actual).isEqualTo(expected);
    }

}
