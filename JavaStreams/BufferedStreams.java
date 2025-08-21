import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        String src = "largeFile.dat";
        String dest1 = "copy_unbuffered.dat";
        String dest2 = "copy_buffered.dat";

        // Unbuffered copy
        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest1)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        long unbufferedTime = System.nanoTime() - start;

        // Buffered copy
        start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long bufferedTime = System.nanoTime() - start;

        System.out.println("Unbuffered time: " + unbufferedTime/1_000_000 + " ms");
        System.out.println("Buffered time: " + bufferedTime/1_000_000 + " ms");
    }
}
