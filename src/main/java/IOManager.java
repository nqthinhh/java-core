import java.io.FileOutputStream;
import java.io.IOException;

public class IOManager {
    public static void writeBytes(String path,
                                  byte[] bytes,
                                  boolean append) throws IOException {

        try (
                FileOutputStream fos = new FileOutputStream(path, append);

        ) {
            fos.write(bytes);
        }
    }
}
