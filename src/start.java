import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа шифрует и расшифровывает файлы");
        System.out.println("Введите путь к файлу");
        String concole = scanner.nextLine();
        String src = concole;
        System.out.println("Выберите действие (введите цифру):");
        System.out.println("1 - Зашифровать файл");
        System.out.println("2 - Расшифровать файл ключем");
        System.out.println("3 - Подобрать ключ");
        System.out.println("4 - Расшифровать файл методомстатистического анализа");
        String number = scanner.nextLine();
        int select = Integer.parseInt(number);

        Selected(scanner, src, select);

//        String s = getFileContent(src);
//        System.out.println(s);
//        String cript = crypting.cryptoCaesar(s, 25, true);
//        System.out.println(cript);
//        System.out.println(crypting.cryptoCaesar(cript, 25, false));


    }

    private static void Selected(Scanner scanner, String src, int select) {
        if (select == 1) {
            System.out.println("Введите цифры ключа шифрования");
            String keyString = scanner.nextLine();
            int key = Integer.parseInt(keyString);
            String encryptingText = crypting.cryptoCaesar(getFileContent(src), key, true);
            System.out.println("Файл зашифрован");
        } else if (select == 2) {
            System.out.println("Введите ключ для расшифровки");
            String keyString = scanner.nextLine();
            int key = Integer.parseInt(keyString);
            String decriptingText = crypting.cryptoCaesar(getFileContent(src), key, false);
            System.out.println("Файл разшифрован");
        } else if (select == 3) {
            System.out.println("Начат подбор ключа");
            int key = crypting.bruteforce(getFileContent(src));
            System.out.println("Найден ключ шифрования: " + key);
            String decriptingText = crypting.cryptoCaesar(getFileContent(src), key, false);
            System.out.println("Файл разшифрован");
        } else if (select == 4) {
            System.out.println("Начат анализ текста");
            System.out.println("Ну тут еще не готово)))");
        }
    }

    private static String getFileContent(String src) {
        Path path = Path.of(src);
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes);

        } catch (IOException e) {
            System.out.println("Файл не найден(");
            return null;
        }
    }
}
