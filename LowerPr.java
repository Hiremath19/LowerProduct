public class LowerPr {
    private int productID;
    private String productName;
    private double price;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LowerPr(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
}