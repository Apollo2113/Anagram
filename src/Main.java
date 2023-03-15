public class Main {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(Anagram.isAnagram(s1, t1)); // true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(Anagram.isAnagram(s2, t2)); // false
    }
}