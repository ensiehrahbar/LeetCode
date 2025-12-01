package LeetCode;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagram(String[] strs) {
        //map array count of character to string
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        String[] str1 = {"ant", "nat", "map", "nap"};
        System.out.println(groupAnagram(str1));
        String[] str2 = {"a"};
        System.out.println(groupAnagram(str2));
        String[] str3 = {};
        System.out.println(groupAnagram(str3));
    }
}
