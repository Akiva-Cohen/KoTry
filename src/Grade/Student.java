package Grade;
public class Student {
    public String name;
    public Day[] days;

    public String toString() {
        String out = "";
        out += "Name: " + name + "\n";
        for (int i = 0; i < days.length; i++) {
            out += days[i] + "\n";
        }
        return out;
    }
}
