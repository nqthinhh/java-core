import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/a.txt";
        String text = "JavaCore";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        try {
            IOManager.writeBytes(path, bytes, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
