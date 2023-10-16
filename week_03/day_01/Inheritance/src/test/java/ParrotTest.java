import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParrotTest {

    private Parrot parrot;

    @BeforeEach
    public void setUp(){
        parrot = new Parrot("Zazu");
    }

    @Test
    public void canMakeNoise(){
        assertThat(parrot.makeNoise()).isEqualTo("Squawk!");
    }

    @Test
    public void canEat(){
        assertThat(parrot.canEat()).isEqualTo("Mmm, that was tasty!");
    }

    @Test
    public void canLayEgg(){
        assertThat(parrot.layEgg()).isEqualTo("I laid an egg!");
    }


}

