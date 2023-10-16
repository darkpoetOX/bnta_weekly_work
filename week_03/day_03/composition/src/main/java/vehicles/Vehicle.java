package vehicles;

import products.IProduct;

public abstract class Vehicle implements IVehicle {
    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;

    public Vehicle(float weight, int maxSpeed, IProduct baseProduct){
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public long getInventory() {
       return this.baseProduct.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);

    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);

    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void setTitle(String title) {
        this.baseProduct.setTitle(title);

    }

    @Override
    public void addinventory(long amount) {
        this.baseProduct.addinventory(amount);

    }

    @Override
    public void removeInventory(long amount) {
        this.baseProduct.removeInventory(amount);

    }
}
