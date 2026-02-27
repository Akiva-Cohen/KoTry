package Orders;
public class Orders {
    public Order[] orders;
    public String toString() {
        String out = "";
        for (int i = 0; i < orders.length; i++) {
            out = out + orders[i].toString() + "\n";
        }
        return out;
    }
}
