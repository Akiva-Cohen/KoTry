public class App {
    public static void main(String[] args) throws Exception {
        Orders orders = Parser.parse("jsons/test.json", Orders.class);
        System.out.println(orders);
    }
}
