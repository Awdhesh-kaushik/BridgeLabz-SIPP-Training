import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        try {
            File file = new File("original.jpg");
            byte[] bytes;

            // Read image into byte array
            try (FileInputStream fis = new FileInputStream(file);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                bytes = baos.toByteArray();
            }

            // Write byte array back to new image
            try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                 FileOutputStream fos = new FileOutputStream("copy.jpg")) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
