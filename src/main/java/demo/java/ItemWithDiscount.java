package demo.java;


public class ItemWithDiscount extends Item {
    public ItemWithDiscount(Double price) {
        super(price);
    }

    public void calculateDiscount(Double discount) {
        this.price = this.price * (1 - discount/100);
    }
}
