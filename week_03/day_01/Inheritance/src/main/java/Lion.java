public class Lion extends Animal {

    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing){
        super(name); //super means whatever parent class does, it does it to. super call statement MUST BE FIRST.
        this.canWaitToBeKing = canWaitToBeKing;
    }

    @Override
    public String makeNoise(){
        return "ROAR!";
    }


}
