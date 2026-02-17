

public class StringUtil {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= s.length(); i++) {
            sb.append(s.substring(0, i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Baku";

        System.out.println(reverse(s1));
        System.out.println(explode(s2));
    }
}