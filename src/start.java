import java.util.Scanner;

public class start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа шифрует и расшифровывает файлы");
        System.out.println("Введите путь к файлу");
        String concole = scanner.nextLine();
        String src = concole;
        System.out.println("Выберите действие (введите цифру):");
        System.out.println("1 - Зашифровать фаил");
        System.out.println("2 - Расшифровать фаил ключем");
        System.out.println("3 - Подобрать ключ");
        System.out.println("4 - Расшифровать при помощи статистического анализа");
        String number = scanner.nextLine();
        int select = Integer.parseInt(number);
        System.out.println("Вы ввели" + select);



    }
}
