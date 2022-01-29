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
            if (crypt) {
                cryptChar = cryptoAlphabet.get(index + key);
            } else {
                cryptChar = (char) cryptoAlphabet.get(size + index - key);

            }
            cryptingText = cryptingText + cryptChar;
        }

        return cryptingText;
    }

    public static Integer bruteforce(String cryptingText) {
        int temp = Integer.MIN_VALUE;
        int key = 0;
        for (int i = 0; i < cryptoAlphabet().size(); i++) {
            String test = cryptoCaesar(cryptingText, i, false);
            int index = analyzer.analyzer(test);
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
        String symbol = " ,.?!@#$%^&*()_-+=:;|[]{}><\\`\"/~«»\n";
        String digit = "0123456789";

        ArrayList<Character> cryptoAlphabet = new ArrayList<>();

        for (int i = 0; i < ruAlphabet.length(); i++) {
            cryptoAlphabet.add(ruAlphabet.charAt(i));
        }

        for (int i = 0; i < enAlphabet.length(); i++) {
            cryptoAlphabet.add(enAlphabet.charAt(i));
        }

        for (int i = 0; i < symbol.length(); i++) {
            cryptoAlphabet.add(symbol.charAt(i));
        }

        for (int i = 0; i < digit.length(); i++) {
            cryptoAlphabet.add(digit.charAt(i));
        }

        cryptoAlphabet.addAll(cryptoAlphabet);

        return cryptoAlphabet;
    }
}
