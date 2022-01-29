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
        System.out.println("2 - Расшифровать файл ключом");
        System.out.println("3 - Подобрать ключ");
        System.out.println("4 - Расшифровать файл методом статистического анализа");
        String number = scanner.nextLine();
        int select = Integer.parseInt(number);
        Selected(scanner, src, select);
    }

    private static void Selected(Scanner scanner, String src, int select) {
        if (select == 1) {
            System.out.println("Введите цифры ключа шифрования");
            String keyString = scanner.nextLine();
            int key = Integer.parseInt(keyString);
            String fileContent = fileReadWrite.getFileContent(src);
            String encryptedContent = crypting.cryptoCaesar(fileContent, key, true);
            fileReadWrite.setFileContent(src, "_encrypted", encryptedContent);
            System.out.println("Файл зашифрован");
        } else if (select == 2) {
            System.out.println("Введите ключ для расшифровки");
            String keyString = scanner.nextLine();
            int key = Integer.parseInt(keyString);
            String fileContent = fileReadWrite.getFileContent(src);
            String decryptedContent = crypting.cryptoCaesar(fileContent, key, false);
            fileReadWrite.setFileContent(src, "_decrypted", decryptedContent);
            System.out.println("Файл раcшифрован");
        } else if (select == 3) {
            System.out.println("Начат подбор ключа");
            String fileContent = fileReadWrite.getFileContent(src);
            int key = crypting.bruteforce(fileContent);
            System.out.println("Найден ключ шифрования: " + key);
            String decryptedContent = crypting.cryptoCaesar(fileContent, key, false);
            fileReadWrite.setFileContent(src, "_decrypted", decryptedContent);
            System.out.println("Файл разшифрован");
        } else if (select == 4) {
            System.out.println("Введите путь к файлу с образцом текста");
            String sample = scanner.nextLine();
            System.out.println("Начат анализ текста");
            analyzer.statisticAnalyzer(src, sample);
            System.out.println("Ну тут еще не готово)))");
        }
    }


}
