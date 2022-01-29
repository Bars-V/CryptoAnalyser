import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class fileReadWrite {
    public static String getFileContent(String src) {
        Path path = Path.of(src);
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);

        } catch (IOException e) {
            System.out.println("Файл не найден");
            return null;
        }
    }

    public static void setFileContent(String src, String sufix, String content) {
        int x = src.lastIndexOf('.');
        String dst = src.substring(0, x) + sufix + src.substring(x, src.length());
        try {
            Files.createFile(Path.of(dst));
            Path path = Path.of(dst);
            Files.write(path, Collections.singleton(content));
        } catch (IOException e) {
            System.out.println("Файл не создан");
        }
    }
}
