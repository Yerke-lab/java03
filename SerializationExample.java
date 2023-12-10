import java.io.*;

public class SerializationExample {
    public static void serializeStudent(Student student) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            outputStream.writeObject(student);
            System.out.println("Student object has been serialized to 'student.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeStudent() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) inputStream.readObject();
            System.out.println("Student object has been deserialized from 'student.ser'");
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
