import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String filename = "student.dat";

        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Student: " + roll + " | " + name + " | " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
