public class Order {
    public String name;
    public String sku;
    public double price;
    public Adress shipTo;
    public Adress billTo;
    public String toString() {
        String out = "";
        out = out + "Name: " + name + "\n";
        out = out + "Sku: " + sku + "\n";
        out = out + "Price: " + price + "\n";
        out = out + "Shipping: " + shipTo.toString() + "\n";
        out = out + "Billing: " + billTo.toString() + "\n";
        return out;
    }
}
