public abstract class Animal {
    protected String name;


    public Animal(String name){
        this.name = name;

    }

    public String makeNoise(){
        return "Hello, my name is " + this.name + ".";

    }

    public String canEat(){
        return "Mmm, that was tasty!";
    }
}
