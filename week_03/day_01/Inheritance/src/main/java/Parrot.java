public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }


    @Override
    public String makeNoise() {
        return "Squawk!";
    }


    public String layEgg(){
        return "I laid an egg!";
    }
}
