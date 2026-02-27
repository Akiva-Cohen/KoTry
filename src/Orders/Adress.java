package Orders;
public class Adress {
    public String name;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String toString() {
        String out = "";
        out = out + name + "\n";
        out = out + address + "\n";
        out = out + city + ", " + state + "\n";
        out = out + zip + "\n";
        return out;
    }
}
