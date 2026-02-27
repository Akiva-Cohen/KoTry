public class App {
    public static void main(String[] args) throws Exception {
        Grade orders = Parser.parse("jsons/testStudents.json", Grade.class);
        System.out.println(orders);
    }
}
