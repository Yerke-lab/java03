public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student("Anna", 20, 3.8);

        SerializationExample.serializeStudent(originalStudent);

        Student deserializedStudent = SerializationExample.deserializeStudent();
        if (deserializedStudent != null) {
            System.out.println("Name: " + deserializedStudent.getName());
            System.out.println("Age: " + deserializedStudent.getAge());
            System.out.println("GPA: " + deserializedStudent.getGPA());
        }
    }
}
