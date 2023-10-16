package vehicles;

import products.IProduct;

public interface IVehicle extends IProduct {
    float getWeight();
    int getMaxSpeed();
    void setWeight(float weight);
    void setMaxSpeed(int maxSpeed);
}
