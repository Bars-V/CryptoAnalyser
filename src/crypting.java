import java.util.ArrayList;

public class crypting {

    public static String cryptoCaesar(String text, int key, boolean crypt) {
        String cryptingText = "";
        ArrayList<Character> cryptoAlphabet = crypting.cryptoAlphabet();
        int size = crypting.cryptoAlphabet().size() / 2;

        while (key > size) {
            key = key - size;
        }

        if (key == size) {
            key = 100;
        }
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int index = cryptoAlphabet.indexOf(a);
            char cryptChar;
            if (index > 0) {
                if (crypt) {
                    cryptChar = cryptoAlphabet.get(index + key);
                } else {
                    cryptChar = cryptoAlphabet.get(size + index - key);
                }
            } else {
                cryptChar = a;
            }
            cryptingText = cryptingText + cryptChar;
        }

        return cryptingText;
    }

    public static String cryptoCaesar(String text, int key, ArrayList Alphabet) {
        String cryptingText = "";
        ArrayList<Character> cryptoAlphabet = Alphabet;
        int size = crypting.cryptoAlphabet().size() / 2;

        while (key > size) {
            key = key - size;
        }

        if (key == size) {
            key = 100;
        }
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int index = cryptoAlphabet.indexOf(a);
            char cryptChar;
            if (index > 0) {
                cryptChar = cryptoAlphabet.get(size + index - key);
            } else {
                cryptChar = a;
            }
            cryptingText = cryptingText + cryptChar;
        }

        return cryptingText;
    }

    public static Integer bruteforce(String cryptingText) {
        String text = cryptingText.substring(0, 10_000);
        int temp = Integer.MIN_VALUE;
        int key = 0;
        for (int i = 0; i < cryptoAlphabet().size(); i++) {
            String test = cryptoCaesar(text, i, false);
            int index = analyzer.valid(test);
            if (index > temp) {
                temp = index;
                key = i;
            }
        }
        return key;
    }

    private static ArrayList cryptoAlphabet() {

        String ruAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String enAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbol = " ,.?!@#$%^&*()_-+=:;|[]{}><\\`\"/~«»";
        String digit = "0123456789";

        ArrayList<Character> cryptoAlphabet = new ArrayList<>();

        for (int i = 0; i < ruAlphabet.length(); i++) {
            cryptoAlphabet.add(ruAlphabet.charAt(i));
        }

        for (int i = 0; i < enAlphabet.length(); i++) {
            cryptoAlphabet.add(enAlphabet.charAt(i));
        }

        for (int i = 0; i < digit.length(); i++) {
            cryptoAlphabet.add(digit.charAt(i));
        }

        for (int i = 0; i < symbol.length(); i++) {
            cryptoAlphabet.add(symbol.charAt(i));
        }

        cryptoAlphabet.addAll(cryptoAlphabet);

        return cryptoAlphabet;
    }
}
