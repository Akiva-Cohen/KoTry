import com.google.gson.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Parser {
    Gson thing;
    public Parser() {
        thing = new Gson();
    }
    public Orders parseTest() {
        return parse("jsons/test.json", Orders.class);
    }
    public <type> type parse(String path, Class<type> type) {
        String json = new String();
        try {
            json = new String(Files.readAllBytes(Paths.get("jsons/test.json")));
        } catch (Exception e) {

        }
        type output = thing.fromJson(json, type);
        return output;
        }
}
