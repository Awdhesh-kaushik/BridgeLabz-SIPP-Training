import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user.txt")) {

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter favorite programming language: ");
            String lang = br.readLine();

            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);

            System.out.println("Data saved to user.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
