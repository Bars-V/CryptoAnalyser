import java.util.ArrayList;

public class coder {

    private static String cryptoCaesar(String text, int key) {
        String cryptBlablabla = "";

        ArrayList<Character> cryptoAlphabet = coder.cryptoAlphabet();
        int size = coder.cryptoAlphabet().size() / 2;


        while (key > size) {
            key = key - size;
        }

        if (key == size) {
            key = 100;
        }

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            int index = cryptoAlphabet.indexOf(a);
            char cryptChar = cryptoAlphabet.get(index + key);
            cryptBlablabla = cryptBlablabla + cryptChar;
        }

        return cryptBlablabla;
    }


    public static ArrayList cryptoAlphabet() {

        String ruAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String enAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbol = " ,.?!@#$%^&*()_-+=:;|[]{}><\\`\"/~«»";
        String digit = "0123456789";

        ArrayList<Character> cryptoAlphabet = new ArrayList<>();

        for (int i = 0; i < ruAlphabet.length(); i++) {
            cryptoAlphabet.add(ruAlphabet.charAt(i));
        }

//        for (int i = 0; i < enAlphabet.length(); i++) {
//            cryptoAlphabet.add(enAlphabet.charAt(i));
//        }

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
