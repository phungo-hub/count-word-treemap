import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "Tùng mập thich nghe Mai kể chuyện ma, Mai cũng thích";
        String[] input = string.split(" ");
        TreeMap<String, Integer> listCounts = new TreeMap();

        for (int i = 0; i < input.length; i++) {
            String key = input[i].toLowerCase();
            if (listCounts.get(key) == null)
                listCounts.put(key, 1);
            else
                listCounts.put(key, (listCounts.get(key)) + 1);
        }
        System.out.println(listCounts);
    }
}
