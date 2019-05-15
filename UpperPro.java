public class UpperPro extends LowerPr {
    int year;
    String productDescription;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public UpperPro(int productID, String productName, double price, int year, String productDescription) {
        super(productID, productName, price);
        this.year = year;
        this.productDescription = productDescription;
    }


    public static void main(String[] args) {


        LowerPr lowerp=new LowerPr(5,"T-holder",20);
        LowerPr lowerp1=new LowerPr(10,"Hotwater",5.5);
        LowerPr lowerp2=new LowerPr(15,"Nesting boxes",12.5);
        LowerPr lowerp3=new LowerPr(20,"Buildingblock",15);
        LowerPr lowerp4=new LowerPr(30,"hexablade",20);
        LowerPr lowerp6=new LowerPr(10,"pictureframe",13);

        System.out.println(""+lowerp.getProductID()+","+lowerp.getProductName()+","+lowerp.getPrice()+"");
        System.out.println(""+lowerp1.getProductID()+","+lowerp1.getProductName()+","+lowerp1.getPrice()+"");
        System.out.println(""+lowerp2.getProductID()+","+lowerp2.getProductName()+","+lowerp2.getPrice()+"");
        System.out.println(""+lowerp3.getProductID()+","+lowerp3.getProductName()+","+lowerp3.getPrice()+"");
        System.out.println(""+lowerp4.getProductID()+","+lowerp4.getProductName()+","+lowerp4.getPrice()+"");
        System.out.println(""+lowerp6.getProductID()+","+lowerp6.getProductName()+","+lowerp6.getPrice()+"");







    }
}
