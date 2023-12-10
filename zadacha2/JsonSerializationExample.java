import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonSerializationExample {
    public static void serializeToJson(Student student) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("student.json")) {
            gson.toJson(student, writer);
            System.out.println("Student object has been serialized to 'student.json'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromJson() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("student.json")) {
            Student student = gson.fromJson(reader, Student.class);
            System.out.println("Student object has been deserialized from 'student.json'");
            return student;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
