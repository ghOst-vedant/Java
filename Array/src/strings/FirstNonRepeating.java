package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeating {

        public static Character firstNonRepeating(String str) {
            // Step 1: Build frequency map
//            Map<Character, Integer> map = new LinkedHashMap<>();
//
//            // Step 2: Find the first character with count == 1
//            for (int i = 0; i < str.length(); i++) {
//                char ch = str.charAt(i);
//                map.put(ch, map.getOrDefault(ch,0) + 1);
//            }
//            for(char key : map.keySet()){
//                if (map.get(key) == 1){
//                    return key;
//                }
//            }
//            return null; // or some special value if not found

//            using arrays
            int[] count = new int[26];

            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            for (int i = 0; i < str.length(); i++){
                if (count[str.charAt(i) - 'a'] == 1) return str.charAt(i);
            }
            return null;
        }

        public static void main(String[] args) {
            String input = "aabbcdeeff";
            System.out.println("First non-repeating: " + firstNonRepeating(input));
        }
}
