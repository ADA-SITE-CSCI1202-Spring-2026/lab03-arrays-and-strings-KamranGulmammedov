import java.util.Arrays;

public class ex9 {

    
    public static String sortString(String input) {
        
        char[] chars = input.toCharArray();
        
        
        Arrays.sort(chars);
        
        
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "hHello";
        String sorted = sortString(original);
        System.out.println("Original: " + original);
        System.out.println("Sorted: " + sorted);
    }
}