import com.google.gson.*;
public class App {
    public static void main(String[] args) throws Exception {
        Parser parser = new Parser();
        Orders orders = parser.parse();
        System.out.println(orders);
    }
}
