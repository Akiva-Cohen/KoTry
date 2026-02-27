package Grade;
public class Grade {
    public Student[] students;

    public String toString() {
        String out = "";
        for (int i = 0; i < students.length; i++) {
            out += students[i] + "\n";
        }
        return out;
    }
}
