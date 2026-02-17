import java.util.Arrays;

public class ex10 {

   
    public static String sortString(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    
    public static boolean areAnagram(String s1, String s2) {
        
    
        String n_s1 = sortString(s1);
        String n_s2 = sortString(s2);

        
        return n_s1.equals(n_s2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagram("listen", "silent")); 
        System.out.println(areAnagram("hello", "world"));   
    }
}