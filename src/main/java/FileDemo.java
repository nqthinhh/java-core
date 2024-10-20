import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/abc.txt";
        //String path = "C:\\Users\\MSI\\Desktop\\BaiTapJava\\abcd.txt";

        boolean  createNewFile = FileManager.createFile(path);
        System.out.println("createNewFile = " + createNewFile);
    }
}
