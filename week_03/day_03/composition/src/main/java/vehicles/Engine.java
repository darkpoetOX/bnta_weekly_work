package vehicles;

public class Engine implements IMotorised{

    private int fuel;
    private int hp;

    public Engine(int fuel, int hp) {
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");
    }

    @Override
    public int getHp() {
        return this.hp = hp;
    }

    @Override
    public int setHp(int hp) {
        return this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel = fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
