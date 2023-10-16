package parts;

import products.IProduct;

public interface IPart extends IProduct {

    String getManufacturer();
    long getPartNumber();
    void setManufacturer(String manufacturer);
    void setPartNumber(long partNumber);

}
