import java.util.HashMap;
import java.util.HashSet;

public class analyzer {
    public static int valid(String text) {
        HashSet<Character> alpabet = new HashSet<>() {{
            add('а');
            add('ы');
            add('у');
            add('е');
            add('и');
            add('ю');
            add('я');
            add('э');
            add('ё');
            add('о');
        }};
        HashSet<String> syllables = new HashSet<>() {{
            add("БА");
            add("БО");
            add("БУ");
            add("БЫ");
            add("БИ");
            add("БЕ");
            add("БЯ");
            add("БЁ");
            add("БЮ");
            add("БЬ");
            add("В");
            add("ВА");
            add("ВО");
            add("ВУ");
            add("ВЫ");
            add("ВИ");
            add("ВЕ");
            add("ВЯ");
            add("ВЁ");
            add("ВЮ");
            add("ВЬ");
            add("Г");
            add("ГА");
            add("ГО");
            add("ГУ");
            add("ГИ");
            add("ГЕ");
            add("ГЁ");
            add("ГЮ");
            add("ГЬ");
            add("Д");
            add("ДА");
            add("ДО");
            add("ДУ");
            add("ДЫ");
            add("ДИ");
            add("ДЕ");
            add("ДЯ");
            add("ДЁ");
            add("ДЮ");
            add("ДЬ");
            add("Ж");
            add("ЖА");
            add("ЖО");
            add("ЖУ");
            add("ЖИ");
            add("ЖЕ");
            add("ЖЁ");
            add("ЖЮ");
            add("ЖЬ");
            add("З");
            add("ЗА");
            add("ЗО");
            add("ЗУ");
            add("ЗЫ");
            add("ЗИ");
            add("ЗЕ");
            add("ЗЯ");
            add("ЗЁ");
            add("ЗЮ");
            add("ЗЬ");
            add("Й");
            add("ЙА");
            add("ЙО");
            add("ЙЕ");
            add("К");
            add("КА");
            add("КО");
            add("КУ");
            add("КЫ");
            add("КИ");
            add("КЕ");
            add("КЁ");
            add("КЮ");
            add("Л");
            add("ЛА");
            add("ЛО");
            add("ЛУ");
            add("ЛЫ");
            add("ЛИ");
            add("ЛЕ");
            add("ЛЯ");
            add("ЛЁ");
            add("ЛЭ");
            add("ЛЮ");
            add("ЛЬ");
            add("М");
            add("МА");
            add("МО");
            add("МУ");
            add("МЫ");
            add("МИ");
            add("МЕ");
            add("МЯ");
            add("МЁ");
            add("МЭ");
            add("МЮ");
            add("МЬ");
            add("Н");
            add("НА");
            add("НО");
            add("НУ");
            add("НЫ");
            add("НИ");
            add("НЕ");
            add("НЯ");
            add("НЁ");
            add("НЮ");
            add("НЬ");
            add("П");
            add("ПА");
            add("ПО");
            add("ПУ");
            add("ПЫ");
            add("ПИ");
            add("ПЕ");
            add("ПЯ");
            add("ПЁ");
            add("ПЭ");
            add("ПЮ");
            add("ПЬ");
            add("Р");
            add("РА");
            add("РО");
            add("РУ");
            add("РЫ");
            add("РИ");
            add("РЕ");
            add("РЯ");
            add("РЁ");
            add("РЭ");
            add("РЮ");
            add("РЬ");
            add("С");
            add("СА");
            add("СО");
            add("СУ");
            add("СЫ");
            add("СИ");
            add("СЕ");
            add("СЯ");
            add("СЁ");
            add("СЭ");
            add("СЮ");
            add("СЬ");
            add("Т");
            add("ТА");
            add("ТО");
            add("ТУ");
            add("ТЫ");
            add("ТИ");
            add("ТЕ");
            add("ТЯ");
            add("ТЁ");
            add("ТЮ");
            add("ТЬ");
            add("Ф");
            add("ФА");
            add("ФО");
            add("ФУ");
            add("ФЫ");
            add("ФИ");
            add("ФЕ");
            add("ФЯ");
            add("ФЁ");
            add("ФЮ");
            add("ФЬ");
            add("Х");
            add("ХА");
            add("ХО");
            add("ХУ");
            add("ХЫ");
            add("ХИ");
            add("ХЕ");
            add("ХЁ");
            add("ХЮ");
            add("Ц");
            add("ЦА");
            add("ЦО");
            add("ЦУ");
            add("ЦЫ");
            add("ЦИ");
            add("ЦЕ");
            add("ЦЮ");
            add("Ч");
            add("ЧА");
            add("ЧО");
            add("ЧУ");
            add("ЧИ");
            add("ЧЕ");
            add("ЧЁ");
            add("ЧЬ");
            add("Ш");
            add("ША");
            add("ШО");
            add("ШУ");
            add("ШИ");
            add("ШЕ");
            add("ШЁ");
            add("ШЬ");
            add("Щ");
            add("ЩА");
            add("ЩО");
            add("ЩУ");
            add("ЩИ");
            add("ЩЕ");
            add("ЩЁ");
            add("ЩЬ");
            add(", ");
            add(". ");
        }};
        if (text == null) {
            return Integer.MIN_VALUE;
        }
        int index = 0;
        int lengthText = text.length();
        for (int i = 0; i < lengthText - 1; i++) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            String temp = "" + a + b;
            if (syllables.contains(temp.toUpperCase())) {
                i++;
                index++;
            } else {
                index--;
            }
        }


        return index;
    }

    public static void statisticAnalyzer(String src, String sample) {
        HashMap srcMap = inMap(fileReadWrite.getFileContent(src));
        HashMap sampleMap = inMap(fileReadWrite.getFileContent(sample));

        int srcSize = srcMap.size();
        int sampleSize = sampleMap.size();

        HashMap<Character, Double> mapAnalizerSrc = new HashMap<>();
        HashMap<Character, Double> mapAnalizerSample = new HashMap<>();

        for (char o : srcMap.keySet()) {
            double index = srcMap.get(o)/srcSize;
            mapAnalizerSample.put(o, index);
        }


    }

    private static HashMap inMap(String fileContent) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < fileContent.length(); i++) {
            char a = fileContent.charAt(i);
            if (hashMap.containsKey(a)) {
                hashMap.get(a);
                hashMap.put(a, hashMap.get(a) + 1);
            } else {
                hashMap.put(a, 1);
            }
        }
        return hashMap;
    }
}
