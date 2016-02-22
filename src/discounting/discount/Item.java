package discounting.discount;

/**
 * Created by ngondo on 2/3/16.
 */
public class Item {
    String name;
    double Price;
    double Discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        Price = price;
        Discount = discount;
    }

    public double getPrice() {
        return Price;
    }

    public double getDiscount() {
        return Discount;
    }
}
