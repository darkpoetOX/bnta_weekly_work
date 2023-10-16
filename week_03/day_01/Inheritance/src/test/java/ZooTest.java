import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {

    private Zoo zoo;

    @BeforeEach
    public void setUp(){
        zoo = new Zoo();
    }

    @Test
    public void canCountAnimals(){
        assertThat(zoo.countAnimals()).isEqualTo(0);

    }

    @Test
    public void canAddAnimal(){
        Animal animal = new Lion("Simba", false);
        zoo.addAnimal(animal);
        assertThat(zoo.countAnimals()).isEqualTo(1);

    }

    @Test
    public void canAddMultipleAnimals(){
        Animal lion = new Lion("Simba", false); //child class object made from the parent class i.e. Animal on left side, Lion on right side.
        Animal parrot = new Parrot("Zazu");
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        assertThat(zoo.countAnimals()).isEqualTo(2);



    }
}
