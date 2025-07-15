
    import java.util.HashMap;
import java.util.Map;
    public class String13
    {

        public static void main(String[] args) {
            String text = "this is is test test test";
            String[] words = text.split(" ");
            Map<String,Integer> freq = new HashMap<>();
            for (String w : words) {
                freq.put(w, freq.getOrDefault(w,0) + 1);
            }
            String best = null;
            int bestCount = 0;
            for (Map.Entry<String,Integer> e : freq.entrySet()) {
                if (e.getValue() > bestCount) {
                    best = e.getKey();
                    bestCount = e.getValue();
                }
            }
            System.out.println("Most frequent: " + best);
        }
    }


