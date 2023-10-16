package vehicles;

public interface IMotorised {

    void startEngine();
    void stopEngine();
    int getHp();
    int setHp(int hp);
    int getFuel();
    void setFuel(int fuel);
}
