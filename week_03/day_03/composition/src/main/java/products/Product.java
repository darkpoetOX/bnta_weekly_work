package products;

public class Product implements IProduct {

    private float price;
    private long inventory;
    private String title;

    public Product(float price, long inventory, String title){
        this.price = price;
        this.inventory = inventory;
        this.title = title;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public long getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(long inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void addinventory(long amount) {

        this.inventory += amount;

    }

    @Override
    public void removeInventory(long amount) {

        this.inventory -= amount;

    }
}
