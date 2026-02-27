import com.google.gson.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Parser {
    Gson thing;
    public Parser() {
        thing = new Gson();
    }
    public Orders parse() {
        String json = new String();
        try {
            json = new String(Files.readAllBytes(Paths.get("jsons/test.json")));
        } catch (Exception e) {

        }
        Orders orders = thing.fromJson(json, Orders.class);
        return orders;
        }
}
